/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania_FX;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.application.Platform;
import static javafx.application.Platform.exit;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

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
    public void ext() {
           exit();
    }
    @FXML
    public void start() throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/badania_FX/Questionnaire_1.fxml"));
        Pane pane = loader.load();
        Questionnaire_1Controller questionnaire_1Controller = loader.getController(); //tu coś nie działa!
       
    }

}
