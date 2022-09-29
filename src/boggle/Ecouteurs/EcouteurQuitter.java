package boggle.Ecouteurs;

import boggle.model.Boggle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurQuitter implements EventHandler<ActionEvent>{
    private Boggle bgl;

    public EcouteurQuitter(Boggle bgl){
        this.bgl=bgl;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Platform.exit();
        bgl.notifierObservateurs();
    }
}
