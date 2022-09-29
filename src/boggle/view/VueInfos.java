package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class VueInfos extends TilePane implements Observateur {
    private Boggle bgl;
    private Label score;
    private Label motChoisi;
    private Label ListeDesMots;


    /*
    Les constructeurs
     */
    public VueInfos(Boggle bgl) {
        this.bgl = bgl;
         score = new Label("Score:"+this.bgl.getScore());
         motChoisi = new Label("Mot choisi: "+this.bgl.getMotChoisi());
         ListeDesMots = new Label("Liste de mots"+this.bgl.getmot(bgl.getMotChoisi()));
        this.getChildren().addAll(motChoisi,score,ListeDesMots);
        this.setHgap(20);
        this.setPadding(new Insets(10));
        ListeDesMots.setMaxHeight(4);
        this.bgl.ajouterObservateur(this) ;
        score.setStyle("-fx-font:  18 arial ;-fx-border-color:#370028; -fx-text-fill:#8f8f8f") ;
        motChoisi.setStyle("-fx-font:  18 arial ;-fx-border-color:#370028;-fx-text-fill:#8f8f8f") ;
        ListeDesMots.setStyle("-fx-font:  18 arial ;-fx-border-color:#370028;-fx-text-fill:#8f8f8f") ;
    }
 @Override
public void reagir() {
     this.score.setText(String.valueOf("Score:"+this.bgl.getScore()));
     this.motChoisi.setText("Mot choisi: "+this.bgl.getMotChoisi());
     /*
    cette fonction elle permet d'ajouter a la liste les mot deja cree
     ;mon affichage decaller beaucoup les score et lettre
    choisie c'est pour cella que j'ai mis l'affichage en commentaire;
    mais vous pouvez toujour l'essayer ;ça marche bien
     */
     this.ListeDesMots.setText("Les mots  choisis: "+this.bgl.getmot(bgl.getMotChoisi()));


 }
}