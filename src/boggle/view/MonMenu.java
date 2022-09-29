package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MonMenu extends MenuBar implements Observateur {
    private Boggle bgl;
    private Menu menu;
    public  MonMenu(Boggle bgl) {
        this.bgl=bgl;

        Menu monmenu= new Menu("Boggle");

        // cration menuitems
        MenuItem monmenu1 = new MenuItem("Sauvegarder");
        MenuItem monmenu2 = new MenuItem("Reprendre");

        // Ajouter menuitem dans menu
        monmenu.getItems().add(monmenu1);
        monmenu.getItems().add(monmenu2);
        this.getMenus().add(monmenu);
        monmenu.setStyle("-fx-text-fill:#370028") ;
    }

    @Override
    public void reagir() {

    }
}
