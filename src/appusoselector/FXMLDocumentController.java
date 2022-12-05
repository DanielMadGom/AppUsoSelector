package appusoselector;

import componente_madridDaniel.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Dani Madrid
 */
public class FXMLDocumentController implements Initializable {
    // TODO
    @FXML
    private SelectorDeslizamiento SelectArriba;
    @FXML
    private SelectorDeslizamiento SelectAbajo;
    @FXML
    private Label TituloSelectores;
    @FXML
    private Label AlertaUsoSelector;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ArrayList<String> colores = new ArrayList<String>();
       
        colores.add("Rojo");
        colores.add("Amarillo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Morado");
        colores.add("Rosa");
        
        
        SelectArriba.setItems(colores);
        SelectAbajo.setItems(colores);
    }

    @FXML
    private void UsoSelectorArriba(ActionEvent event) {
        AlertaUsoSelector.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void UsoSelectorAbajo(ActionEvent event) {
        AlertaUsoSelector.setText("Pulsado el selector de abajo");
    }
}    
