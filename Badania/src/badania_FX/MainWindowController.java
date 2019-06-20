/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania_FX;

import java.io.IOException;
import static javafx.application.Platform.exit;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 *
 * @author Prezes
 */
public class MainWindowController {
    
     private MainScreenController mainScreenController;
    
     @FXML
    public void ext() {
           exit();
    }
    @FXML
    public void start() throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/badania_FX/questionnaire_1.fxml"));
        Pane pane = loader.load();
        Questionnaire_1Controller questionnaire_1Controller = loader.getController();
        questionnaire_1Controller.setMainScreenController(mainScreenController);
        mainScreenController.setScreen(pane);
    }
   
    public MainScreenController getMainController() {
        return mainScreenController;
    }

    public void setMainScreenController(MainScreenController main) {
        this.mainScreenController = main;
    } 
}
