package boggle.view;

import boggle.Ecouteurs.EcouteurEffacer;
import boggle.Ecouteurs.EcouteurLettre;
import boggle.Ecouteurs.EcouteurQuitter;
import boggle.Ecouteurs.EcouteurValider;
import boggle.Observateur;
import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import javax.swing.border.Border;

public class PanneauControle extends VBox implements Observateur {
    private Boggle bgl;
    private Button button1;
    private Button button2;
    private Button button3;


    public PanneauControle(Boggle bgl){
        this.bgl =bgl;
        button1 = new Button("Valider");
        button2 = new Button("Effacer");
        button3 = new Button("Quiter");

        button1.setMaxSize(140,140);
        button2.setMaxSize(140,140);
        button3.setMaxSize(140,140);


        button1.setStyle("-fx-font: 19 arial;-fx-background-color: #8f8f8f ;-fx-text-fill:#370028") ;
        button2.setStyle("-fx-font: 19 arial;-fx-background-color: #8f8f8f;-fx-text-fill:#370028") ;
        button3.setStyle("-fx-font: 19 arial;-fx-background-color: #8f8f8f;-fx-text-fill:#370028") ;

        button1.setOnAction(new EcouteurValider(this.bgl));
        button2.setOnAction(new EcouteurEffacer(this.bgl));
        button3.setOnAction(new EcouteurQuitter(this.bgl));


        this.getChildren().addAll(button1,button2,button3);
        this.bgl.ajouterObservateur(this);
    }
    @Override
    public void reagir(){

    }
}