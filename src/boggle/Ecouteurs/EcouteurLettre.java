package boggle.Ecouteurs;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurLettre implements EventHandler<ActionEvent> {
    private Boggle bgl;
    private int col;
    private int lig;


    public EcouteurLettre(int lig, int col,Boggle bgl){
       this.bgl= bgl;
       this.col= col;
       this.lig= lig;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
       bgl.ajouterLettre(lig,col);
       bgl.notifierObservateurs();

    }
}
