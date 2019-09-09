package Events;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class EventoVentana implements EventHandler {

    @Override
    public void handle(Event event) {

        Alert objAlert = new Alert(Alert.AlertType.CONFIRMATION);
        objAlert.setTitle("Confirmación de acción");
        objAlert.setHeaderText("Confirmando.... :)");
        objAlert.setContentText("En verdad deseas salir de la aplicación, segurito, segurito????");
        Optional<ButtonType> btnOpciones =  objAlert.showAndWait();
        if( btnOpciones.get() == ButtonType.OK ){
            //System.exit(0);
        }
        else
            return;
    }
}
