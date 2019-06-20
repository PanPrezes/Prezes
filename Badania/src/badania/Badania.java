/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania;

import java.io.StringWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import jess.JessException;
import jess.Rete;

/**
 *
 * @author Prezes
 */
public class Badania extends Application {
public static Rete engine;
    public static int pal_tyton, dos_antykoncepcja, lamp_sol, otylosc, prac_srod_chem,            //
            sz_miesiaczka, stan_podgoraczkowy, prom_ultraf, dieta_w_tluszcze, przewl_inf_ukl_mocz,//
            poz_w_rodzenia, w_rak_piersi, cz_spoz_cz_mies, wiek_pow_59,                     //zmienne czynników ryzyka
            spo_pok_smazonych, sp_alkohol, rak_grucz_brat, spo_pok_grill,                     //
            menopauza_otylosc, rak_grucz_ojciec, wiek_pow_49, brat_jelito,                        //
            siostra_jelito, ojciec_jelito, matka_jelito, dziadek_jelito, babcia_jelito;           //

    public static void setA2(int pal_tyton) {
        Badania.pal_tyton = pal_tyton;
    }

    public static void setDos_antykoncepcja(int dos_antykoncepcja) {
        Badania.dos_antykoncepcja = dos_antykoncepcja;
    }

    public static void setLamp_sol(int lamp_sol) {
        Badania.lamp_sol = lamp_sol;
    }

    public static void setOtylosc(int otylosc) {
        Badania.otylosc = otylosc;
    }

    public static void setPrac_srod_chem(int prac_srod_chem) {
        Badania.prac_srod_chem = prac_srod_chem;
    }

    public static void setSz_miesiaczka(int sz_miesiaczka) {
        Badania.sz_miesiaczka = sz_miesiaczka;
    }

    public static void setStan_podgoraczkowy(int stan_podgoraczkowy) {
        Badania.stan_podgoraczkowy = stan_podgoraczkowy;
    }

    public static void setProm_ultraf(int prom_ultraf) {
        Badania.prom_ultraf = prom_ultraf;
    }

    public static void setDieta_w_tluszcze(int dieta_w_tluszcze) {
        Badania.dieta_w_tluszcze = dieta_w_tluszcze;
    }

    public static void setPrzewl_inf_ukl_mocz(int przewl_inf_ukl_mocz) {
        Badania.przewl_inf_ukl_mocz = przewl_inf_ukl_mocz;
    }

    public static void setPoz_w_rodzenia(int poz_w_rodzenia) {
        Badania.poz_w_rodzenia = poz_w_rodzenia;
    }

    public static void setW_rak_piersi(int w_rak_piersi) {
        Badania.w_rak_piersi = w_rak_piersi;
    }

    public static void setCz_spoz_cz_mies(int cz_spoz_cz_mies) {
        Badania.cz_spoz_cz_mies = cz_spoz_cz_mies;
    }

    public static void setWiek_pow_59(int wiek_pow_59) {
        Badania.wiek_pow_59 = wiek_pow_59;
    }

    public static void setSpo_pok_smazonych(int spo_pok_smazonych) {
        Badania.spo_pok_smazonych = spo_pok_smazonych;
    }

    public static void setSp_alkohol(int sp_alkohol) {
        Badania.sp_alkohol = sp_alkohol;
    }

    public static void setRak_grucz_brat(int rak_grucz_brat) {
        Badania.rak_grucz_brat = rak_grucz_brat;
    }

    public static void setSpo_pok_grill(int spo_pok_grill) {
        Badania.spo_pok_grill = spo_pok_grill;
    }

    public static void setMenopauza_otylosc(int menopauza_otylosc) {
        Badania.menopauza_otylosc = menopauza_otylosc;
    }

    public static void setRak_grucz_ojciec(int rak_grucz_ojciec) {
        Badania.rak_grucz_ojciec = rak_grucz_ojciec;
    }

    public static void setWiek_pow_49(int wiek_pow_49) {
        Badania.wiek_pow_49 = wiek_pow_49;
    }

    public static void setBrat_jelito(int brat_jelito) {
        Badania.brat_jelito = brat_jelito;
    }

    public static void setSiostra_jelito(int siostra_jelito) {
        Badania.siostra_jelito = siostra_jelito;
    }

    public static void setOjciec_jelito(int ojciec_jelito) {
        Badania.ojciec_jelito = ojciec_jelito;
    }

    public static void setMatka_jelito(int matka_jelito) {
        Badania.matka_jelito = matka_jelito;
    }

    public static void setDziadek_jelito(int dziadek_jelito) {
        Badania.dziadek_jelito = dziadek_jelito;
    }

    public static void setBabcia_jelito(int babcia_jelito) {
        Badania.babcia_jelito = babcia_jelito;
    }

    public static int niet_krwawienie, krw_mocz, bol_odd_mocz, czest_mocz_niepel_oproz_pech, // 
            bol_podbrz, prob_odd_mocz, oslabienie, guz_w_piersi, as_piersi, sk_na_piersi,    //
            wciek_brodawka, s12, st_podgoraczkowy, pokaslywanie, chudniecie,                 //zmienne symptomów
            uczucie_oslabienia, ryz_zachor_rak_pluc, zmiana_skorna, wycz_guz_krok,           //
            as_grucz_krok, s21, zm_tr_wyprozniania, kr_stolec, st_stolcu;                    //

    public static void setNiet_krwawienie(int niet_krwawienie) {
        Badania.niet_krwawienie = niet_krwawienie;
    }

    public static void setKrw_mocz(int krw_mocz) {
        Badania.krw_mocz = krw_mocz;
    }

    public static void setBol_odd_mocz(int bol_odd_mocz) {
        Badania.bol_odd_mocz = bol_odd_mocz;
    }

    public static void setCzest_mocz_niepel_oproz_pech(int czest_mocz_niepel_oproz_pech) {
        Badania.czest_mocz_niepel_oproz_pech = czest_mocz_niepel_oproz_pech;
    }

    public static void setBol_podbrz(int bol_podbrz) {
        Badania.bol_podbrz = bol_podbrz;
    }

    public static void setProb_odd_mocz(int prob_odd_mocz) {
        Badania.prob_odd_mocz = prob_odd_mocz;
    }

    public static void setOslabienie(int oslabienie) {
        Badania.oslabienie = oslabienie;
    }

    public static void setGuz_w_piersi(int guz_w_piersi) {
        Badania.guz_w_piersi = guz_w_piersi;
    }

    public static void setAs_piersi(int as_piersi) {
        Badania.as_piersi = as_piersi;
    }

    public static void setSk_na_piersi(int sk_na_piersi) {
        Badania.sk_na_piersi = sk_na_piersi;
    }

    public static void setWciek_brodawka(int wciek_brodawka) {
        Badania.wciek_brodawka = wciek_brodawka;
    }

    public static void setS12(int s12) {
        Badania.s12 = s12;
    }

    public static void setSt_podgoraczkowy(int st_podgoraczkowy) {
        Badania.st_podgoraczkowy = st_podgoraczkowy;
    }

    public static void setPokaslywanie(int pokaslywanie) {
        Badania.pokaslywanie = pokaslywanie;
    }

    public static void setChudniecie(int chudniecie) {
        Badania.chudniecie = chudniecie;
    }

    public static void setUczucie_oslabienia(int uczucie_oslabienia) {
        Badania.uczucie_oslabienia = uczucie_oslabienia;
    }

    public static void setRyz_zachor_rak_pluc(int ryz_zachor_rak_pluc) {
        Badania.ryz_zachor_rak_pluc = ryz_zachor_rak_pluc;
    }

    public static void setZmiana_skorna(int zmiana_skorna) {
        Badania.zmiana_skorna = zmiana_skorna;
    }

    public static void setWycz_guz_krok(int wycz_guz_krok) {
        Badania.wycz_guz_krok = wycz_guz_krok;
    }

    public static void setAs_grucz_krok(int as_grucz_krok) {
        Badania.as_grucz_krok = as_grucz_krok;
    }

    public static void setS21(int s21) {
        Badania.s21 = s21;
    }

    public static void setZm_tr_wyprozniania(int zm_tr_wyprozniania) {
        Badania.zm_tr_wyprozniania = zm_tr_wyprozniania;
    }

    public static void setKr_stolec(int kr_stolec) {
        Badania.kr_stolec = kr_stolec;
    }

    public static void setSt_stolcu(int st_stolcu) {
        Badania.st_stolcu = st_stolcu;
    }

    public static String K1, K2, K3, K4, K5, K6, K7, K8; // zmienne przechowujące komunikaty

    public static void setK1(String K1) {
        Badania.K1 = K1;
    }

    public static void setK2(String K2) {
        Badania.K2 = K2;
    }

    public static void setK3(String K3) {
        Badania.K3 = K3;
    }

    public static void setK4(String K4) {
        Badania.K4 = K4;
    }

    public static void setK5(String K5) {
        Badania.K5 = K5;
    }

    public static void setK6(String K6) {
        Badania.K6 = K6;
    }

    public static void setK7(String K7) {
        Badania.K7 = K7;
    }

    public static void setK8(String K8) {
        Badania.K8 = K8;
    }

  @Override
    public void start(Stage primaryStage) throws Exception {
       
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/badania_FX/MainScreen.fxml"));
        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Program");
        primaryStage.show();
        primaryStage.setResizable(false);
    }
   

    public static String queryInferenceEngine(String s) throws JessException {
        // Create a Jess rule engine
        engine = new Rete();
        engine.reset();
        StringWriter o = new StringWriter();
        engine.addOutputRouter("t", o);
        String result = "";
        engine.batch("projekt/JESS/diagnose.clp");
        engine.eval(s);
        engine.run();

        result = o.toString();
        engine.clear();
        if (result == null ? "" == null : result.equals("")) {
            result = "No cancer was diagnosed"
                    + " Please try again";
        }
        return result;
   
    
    }

}
