/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania_FX;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import badania.Badania;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Prezes
 */
public class Questionnaire_1Controller implements Initializable  {
    
 private MainScreenController mainScreenController;

       @FXML
    void a2() {
Badania.pal_tyton=1;
    }

    @FXML
    void a3() {
Badania.dos_antykoncepcja=1;
    }

    @FXML
    void a5() {
Badania.lamp_sol=1;
    }

    @FXML
    void a6() {
Badania.otylosc=1;
    }

    @FXML
    void b2() {
Badania.prac_srod_chem=1;
    }

    @FXML
    void b3() {
Badania.sz_miesiaczka=1;
    }

    @FXML
    void b5() {
Badania.prom_ultraf=1;
    }

    @FXML
    void b8() {
Badania.dieta_w_tluszcze=1;
    }

    @FXML
    void c2() {
Badania.przewl_inf_ukl_mocz=1;
    }

    @FXML
    void c3() {
Badania.poz_w_rodzenia=1;
    }
      @FXML
    void c8() {
Badania.br_akt_fizycznej=1;
    }

    @FXML
    void e3() {
Badania.w_rak_piersi=1;
    }

   @FXML
    void e6() {
Badania.cz_spoz_cz_mies=1;
    }

    @FXML
    void e7() {
Badania.wiek_pow_59=1;
    }

    @FXML
    void e8() {
Badania.spo_pok_smazonych=1;
    }

    @FXML
    void f3() {
Badania.sp_alkohol=1;
    }

    @FXML
    void f7() {
Badania.rak_grucz_brat=1;
    }

    @FXML
    void f8() {
Badania.spo_pok_grill=1;
    }

    @FXML
    void g3() {
Badania.menopauza_otylosc=1;
    }

    @FXML
    void g7() {
Badania.rak_grucz_ojciec=1;
    }

    @FXML
    void g8() {
Badania.wiek_pow_49=1;
    }

    @FXML
    void h8() {
Badania.brat_jelito=1;
    }

    @FXML
    void i8() {
Badania.siostra_jelito=1;
    }

    @FXML
    void j8() {
Badania.ojciec_jelito=1;
    }

    @FXML
    void k8() {
Badania.matka_jelito=1;
    }

    @FXML
    void l8() {
Badania.dziadek_jelito=1;
    }

    @FXML
    void m8() {
Badania.babcia_jelito=1;
    }
    
    @FXML
    void next() throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/badania_FX/questionnaire_2.fxml"));
        Pane pane = loader.load();
        Questionnaire_2Controller questionnaire_2Controller = loader.getController();
        questionnaire_2Controller.setMainScreenController(mainScreenController);
        mainScreenController.setScreen(pane);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        // TODO TODO TODOOOOO
    
    }    

     public void setMainScreenController(MainScreenController main) {
        this.mainScreenController = main;
    } 

  
}
