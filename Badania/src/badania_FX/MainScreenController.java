/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania_FX;

import java.awt.event.ActionEvent;
import javafx.application.Platform;
import static javafx.application.Platform.exit;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Prezes
 */

public class MainScreenController {

    
    @FXML
    void end(ActionEvent event) {
           exit();
    }

}
