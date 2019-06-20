/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania_FX;

import java.io.IOException;
import javafx.application.Platform;
import static javafx.application.Platform.exit;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Prezes
 */

public class MainScreenController {

  

    /**
     *
     */
       @FXML
    private StackPane mainStackPane;

  @FXML
    public void initialize() throws IOException {

        loadMainWindowScreen();
    }
  
    public void loadMainWindowScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/badania_FX/MainWindowScreen.fxml"));
        Pane pane = loader.load();

        MainWindowController MainWindowController = loader.getController();
        MainWindowController.setMainScreenController(this);
        mainStackPane.getChildren().add(pane);

    }

    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);
    }

     
       
    }


