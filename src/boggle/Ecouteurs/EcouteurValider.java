package boggle.Ecouteurs;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurValider implements EventHandler<ActionEvent> {
    private Boggle bgl;
    private boolean b=true;
    public EcouteurValider(Boggle bgl){
        this.bgl=bgl;
    }
    @Override
    public void handle(ActionEvent actionEvent){
        bgl.valider();
        bgl.notifierObservateurs();
    }

}