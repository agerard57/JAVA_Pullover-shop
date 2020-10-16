package controller;

import java.io.IOException;
import java.net.URL;

import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControllerMenu {

    @FXML
    private Menu quitter_btn;


    @FXML
    private AnchorPane ap_clients;

    @FXML
    private AnchorPane ap_produits;

    @FXML
    private AnchorPane ap_commandes;

    @FXML
    private AnchorPane ap_categories;

    @FXML
    private BorderPane bp_menu;
    
    @FXML
    void pageGestionCategories	(MouseEvent event) throws IOException {
    	Parent part = FXMLLoader.load(getClass().getResource("/menu_cat.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void pageGestionProduits(MouseEvent event) throws IOException {
    	Parent part = FXMLLoader.load(getClass().getResource("/menu_produit.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void pageGestionCommandes(MouseEvent event) throws IOException {
    	Parent part = FXMLLoader.load(getClass().getResource("/menu_commande.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void pageGestionClients(MouseEvent event) throws IOException {
    	Parent part = FXMLLoader.load(getClass().getResource("/menu_client.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void quitterProgramme(ActionEvent event) {

    }

}
