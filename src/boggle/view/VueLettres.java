package boggle.view;

import boggle.Ecouteurs.EcouteurLettre;
import boggle.Ecouteurs.EcouteurQuitter;
import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;



public class VueLettres extends GridPane implements Observateur {
    private Boggle bgl;
    private Button[][] tableau;

    /*
    Les constructeurs
     */
    public VueLettres(Boggle bgl) {
        this.bgl = bgl;
        this.tableau = new Button[this.bgl.getTaille()][this.bgl.getTaille()];
        for (int l = 0; l <this.bgl.getTaille(); l++) {
            for (int c = 0; c < this.bgl.getTaille(); c++) {
                char lettre=bgl.getLettre(l,c);
                String str=String.valueOf(lettre);
                this.tableau[l][c]=new Button(str);
                this.add(this.tableau[l][c],l,c);
                tableau[l][c].setOnAction(new EcouteurLettre(l,c,bgl));
                tableau[l][c].setMinSize(40,40);
            }
        }
    }

    @Override
    public void reagir() {

    }
}
