package boggle;

import boggle.model.Boggle;
import boggle.view.MonMenu;
import boggle.view.PanneauControle;
import boggle.view.VueInfos;
import boggle.view.VueLettres;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Boogle");
        Boggle bgl =new Boggle(5);
        BorderPane root=new BorderPane();
        VueLettres vuelettres=new VueLettres(bgl);
        vuelettres.setPadding(new Insets(40));
        root.setCenter(vuelettres);
        VueInfos vueinfos=new VueInfos(bgl);
        vueinfos.setHgap(100);
        root.setBottom(vueinfos);
        PanneauControle panneauControle=new PanneauControle(bgl);
        panneauControle.setPadding(new Insets(65));
        root.setRight(panneauControle);
        root.setStyle("-fx-background-color: #370028");
        MonMenu menuBoggle=new MonMenu(bgl);
        root.setTop(menuBoggle);
        menuBoggle.setStyle("-fx-font: 19 arial;-fx-background-color: #c8c8c8") ;


        stage.setScene(new Scene(root,480,430));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
