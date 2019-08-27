package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {

    private Scene escena;
    private BorderPane contedor;
    private MenuBar mnbMenu;
    private Menu menCompetencia1, menCompetencia2, menSalir;
    private MenuItem mitBuscaMinas;

    private Button btnEjemplo;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        contedor = new BorderPane();
        mnbMenu = new MenuBar();
        menCompetencia1 = new Menu("1er. Competencia");
        menCompetencia2 = new Menu("2da. Competencia");
        menSalir = new Menu("Salir");
        mnbMenu.getMenus().addAll(menCompetencia1,menCompetencia2,menSalir);

        mitBuscaMinas = new MenuItem("Busca Minas");
        menCompetencia1.getItems().addAll(mitBuscaMinas);

        btnEjemplo = new Button("Ejemplo");
        contedor.setCenter(btnEjemplo);
        btnEjemplo.addEventHandler(MouseEvent.MOUSE_CLICKED,this);

        contedor.setTop(mnbMenu);

        escena = new Scene(contedor,300,60);

        primaryStage.setMaximized(true);
        primaryStage.setTitle("Hola mundo de los eventos :)");
        primaryStage.setScene(escena);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        System.out.println("Se dió Click...");
    }
}
