
package kuisvina;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;



public class FXMLDocumentController implements Initializable {
    
   
    
    
   @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker tanggal;

    @FXML
    private TextField harga;

    @FXML
    private Button simpan;

    @FXML
    private ComboBox<String> jenis;

    @FXML
    private TextField merek;

    @FXML
    private TextField warna;

    @FXML
    void initialize() {
        assert tanggal != null : "fx:id=\"tanggal\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert harga != null : "fx:id=\"harga\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert simpan != null : "fx:id=\"simpan\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert jenis != null : "fx:id=\"jenis\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert merek != null : "fx:id=\"merek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert warna != null : "fx:id=\"warna\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }
    
    
   
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
       
        MotherboardDataModel datamodel = new MotherboardDataModel();
        
       Motherboard mtb = new Motherboard();
       mtb.setTanggal_pembelian(tanggal.getValue().toString());
       mtb.setMerek(merek.getText());
       mtb.setHarga(Integer.parseInt(harga.getText()));
       mtb.setJenis(jenis.getValue());
       mtb.setWarna(warna.getText());
       
       datamodel.addMotherboard(mtb);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ArrayList <String> list = new ArrayList<>();
        list.add("Motherboard ATX");
        list.add("Motherboard Micro-ATX");
        list.add("Motherboard Mini ITX");
        list.add("Motherboard E-ATX");
        ObservableList items = FXCollections.observableArrayList(list);
        jenis.setItems(items);
        
        
        
    }    
}
