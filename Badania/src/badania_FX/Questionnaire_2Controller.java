/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania_FX;

import badania.Badania;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Prezes
 */
public class Questionnaire_2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    private MainScreenController mainScreenController;
   
    @FXML
    void s1() {
        Badania.niet_krwawienie = 1;
    }

    @FXML
    void s10() {
        Badania.sk_na_piersi = 1;
    }

    @FXML
    void s11() {
        Badania.wciek_brodawka = 1;
    }

    @FXML
    void s13() {
        Badania.st_podgoraczkowy = 1;
    }

    @FXML
    void s14() {
        Badania.pokaslywanie = 1;
    }

    @FXML
    void s15() {
        Badania.chudniecie = 1;
    }

    @FXML
    void s16() {
        Badania.uczucie_oslabienia = 1;
    }

    @FXML
    void s17() {
        Badania.ryz_zachor_rak_pluc = 1;
    }

    @FXML
    void s18() {
        Badania.zmiana_skorna = 1;
    }

    @FXML
    void s19() {
        Badania.wycz_guz_krok = 1;
    }

    @FXML
    void s2() {
        Badania.krw_mocz = 1;
    }

    @FXML
    void s20() {
        Badania.as_grucz_krok = 1;
    }

    @FXML
    void s22() {
        Badania.zm_tr_wyprozniania = 1;
    }

    @FXML
    void s23() {
        Badania.kr_stolec = 1;
    }

    @FXML
    void s24() {
        Badania.st_stolcu = 1;
    }

    @FXML
    void s3() {
        Badania.bol_odd_mocz = 1;
    }

    @FXML
    void s4() {
        Badania.czest_mocz_niepel_oproz_pech = 1;
    }

    @FXML
    void s5() {
        Badania.bol_podbrz = 1;
    }

    @FXML
    void s6() {
        Badania.prob_odd_mocz = 1;
    }

    @FXML
    void s7() {
        Badania.oslabienie = 1;
    }

    @FXML
    void s8() {
        Badania.guz_w_piersi = 1;
    }

    @FXML
    void s9() {
        Badania.as_piersi = 1;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
 public void setMainScreenController(MainScreenController main) {
        this.mainScreenController = main;
    } 

}
