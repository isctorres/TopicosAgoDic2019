package Views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscaMinas extends Stage {

    private Label lblMinas;
    private TextField txtNoMinas;
    private Button btnGenerar;
    private VBox vBox;
    private HBox hBox;
    private GridPane grpCampo;
    private Scene escena;
    private Button[][] arCeldas;

    public BuscaMinas(){
        CrearGUI();

        this.setTitle("Buscaminas :)");
        this.setScene(escena);
        this.show();
    }

    private void CrearGUI(){

        vBox = new VBox();
        hBox = new HBox();
        lblMinas = new Label("No. Minas");
        txtNoMinas = new TextField();
        btnGenerar = new Button("Generar");
        hBox.getChildren().addAll(lblMinas,txtNoMinas,btnGenerar);

        grpCampo = new GridPane();
        arCeldas = new Button[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                arCeldas[i][j] = new Button();
                arCeldas[i][j].setPrefSize(25,25);
                arCeldas[i][j].setStyle("-fx-base: #b6e7c9");
                grpCampo.add(arCeldas[i][j],i,j);
            }
        }

        vBox.getChildren().addAll(hBox,grpCampo);
        escena = new Scene(vBox,375,425);
    }
}
