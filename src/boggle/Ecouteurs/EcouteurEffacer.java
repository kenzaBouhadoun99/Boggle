package boggle.Ecouteurs;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurEffacer implements EventHandler<ActionEvent> {
    private Boggle bgl;

    public EcouteurEffacer(Boggle bgl){
        this.bgl=bgl;
    }
    @Override
    public void handle(ActionEvent actionEvent){
        bgl.effacer();
        bgl.notifierObservateurs();
    }

}
