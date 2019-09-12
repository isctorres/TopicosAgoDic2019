package Views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Taquimecanografo extends Stage{

    private Scene escena;
    private VBox vbox;
    private ToolBar tlbMenu;
    private TextArea txtTexto, txtEscritura;
    private HBox[] filas;
    private VBox vTeclado;
    private Button btnAbrir;
    private FileChooser flcArchivo;

    private Button[] arTFuncion;
    private Button[] arTNumeros;
    private Button[] arTTabulador;
    private Button[] arTMayus;
    private Button[] arTShift;
    private Button[] arTEspacio;

    public Taquimecanografo(){
        CrearGUI();
        this.setTitle("Taquimecanografo :)");
        this.setScene(escena);
        this.show();
    }

    private void CrearGUI() {
        vbox = new VBox();

        /** crear toolbar */
        tlbMenu = new ToolBar();
        btnAbrir = new Button();
        btnAbrir.setOnAction(event -> BuscarArchivo());
        btnAbrir.setGraphic(new ImageView("Images/open.png"));
        tlbMenu.getItems().add(btnAbrir);

        /* caja de texto donde cargaremos el contenido del archivo*/
        txtTexto = new TextArea();
        txtTexto.setPrefColumnCount(2); /* revisarlo*/
        txtTexto.setPrefRowCount(5);
        txtTexto.setEditable(false);

        /** caja de texto donde capturaremos los eventos del teclado*/
        txtEscritura = new TextArea();
        txtEscritura.setPrefRowCount(5);

        /* creamos la seccion del teclado */
        CrearTeclado();

        vbox.getChildren().addAll(tlbMenu,txtTexto,txtEscritura,vTeclado);

        escena = new Scene(vbox,400,500);
    }

    private void BuscarArchivo() {
        flcArchivo = new FileChooser();
        flcArchivo.setTitle("Buscar Archivo");
        File archivo = flcArchivo.showOpenDialog(this);
        System.out.println("hola");
    }

    private void CrearTeclado() {

        String[] tecla = {"esc","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12"};

        filas = new HBox[6];
        vTeclado = new VBox();
        for (int i = 0; i < 6; i++) {
            filas[i] = new HBox();
            vTeclado.getChildren().add(filas[i]);
        }


        /*String[] tecla = {"esc","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12"};
        arTFuncion = new Button[13];
        for (int i = 0; i <13 ; i++) {
            arTFuncion[i] = new Button(tecla[i]);
            filas[0].getChildren().add(arTFuncion[i]);
        }*/
    }

    private void CrearFila(String[] tecla,Button[] arBotones, HBox hFila){
        arBotones = new Button[tecla.length];
        for (int i = 0; i <tecla.length; i++) {
            arBotones[i] = new Button(tecla[i]);
            hFila.getChildren().add(arBotones[i]);
        }
    }
}
