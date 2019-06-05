/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badania;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import jess.JessException;

/**
 *
 * @author Prezes
 */
public class Badania extends Application {
    
    public static int a2,a3,a5,a6,b2,b3,b4,b5,b8,c2,c3,c4,d2,d4,e3,e4,e6,e7,e8,f3,f4,f7,f8,g3,g7,g8,h8,i8,j8,k8,l8,m8; //zmienne czynników ryzyka
    

    public Badania(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setA2(int a2) {
        Badania.a2 = a2;
    }

    public static void setA3(int a3) {
        Badania.a3 = a3;
    }

    public static void setA5(int a5) {
        Badania.a5 = a5;
    }

    public static void setA6(int a6) {
        Badania.a6 = a6;
    }

    public static void setB2(int b2) {
        Badania.b2 = b2;
    }

    public static void setB3(int b3) {
        Badania.b3 = b3;
    }

    public static void setB4(int b4) {
        Badania.b4 = b4;
    }

    public static void setB5(int b5) {
        Badania.b5 = b5;
    }

    public static void setB8(int b8) {
        Badania.b8 = b8;
    }

    public static void setC2(int c2) {
        Badania.c2 = c2;
    }

    public static void setC3(int c3) {
        Badania.c3 = c3;
    }

    public static void setC4(int c4) {
        Badania.c4 = c4;
    }

    public static void setD2(int d2) {
        Badania.d2 = d2;
    }

    public static void setD4(int d4) {
        Badania.d4 = d4;
    }

    public static void setE3(int e3) {
        Badania.e3 = e3;
    }

    public static void setE4(int e4) {
        Badania.e4 = e4;
    }

    public static void setE6(int e6) {
        Badania.e6 = e6;
    }

    public static void setE7(int e7) {
        Badania.e7 = e7;
    }

    public static void setE8(int e8) {
        Badania.e8 = e8;
    }

    public static void setF3(int f3) {
        Badania.f3 = f3;
    }

    public static void setF4(int f4) {
        Badania.f4 = f4;
    }

    public static void setF7(int f7) {
        Badania.f7 = f7;
    }

    public static void setF8(int f8) {
        Badania.f8 = f8;
    }

    public static void setG3(int g3) {
        Badania.g3 = g3;
    }

    public static void setG7(int g7) {
        Badania.g7 = g7;
    }

    public static void setG8(int g8) {
        Badania.g8 = g8;
    }

    public static void setH8(int h8) {
        Badania.h8 = h8;
    }

    public static void setI8(int i8) {
        Badania.i8 = i8;
    }

    public static void setJ8(int j8) {
        Badania.j8 = j8;
    }

    public static void setK8(int k8) {
        Badania.k8 = k8;
    }

    public static void setL8(int l8) {
        Badania.l8 = l8;
    }

    public static void setM8(int m8) {
        Badania.m8 = m8;
    }

  public static int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24; //zmienne symptomów

    public static void setS1(int s1) {
        Badania.s1 = s1;
    }

    public static void setS2(int s2) {
        Badania.s2 = s2;
    }

    public static void setS3(int s3) {
        Badania.s3 = s3;
    }

    public static void setS4(int s4) {
        Badania.s4 = s4;
    }

    public static void setS5(int s5) {
        Badania.s5 = s5;
    }

    public static void setS6(int s6) {
        Badania.s6 = s6;
    }

    public static void setS7(int s7) {
        Badania.s7 = s7;
    }

    public static void setS8(int s8) {
        Badania.s8 = s8;
    }

    public static void setS9(int s9) {
        Badania.s9 = s9;
    }

    public static void setS10(int s10) {
        Badania.s10 = s10;
    }

    public static void setS11(int s11) {
        Badania.s11 = s11;
    }

    public static void setS12(int s12) {
        Badania.s12 = s12;
    }

    public static void setS13(int s13) {
        Badania.s13 = s13;
    }

    public static void setS14(int s14) {
        Badania.s14 = s14;
    }

    public static void setS15(int s15) {
        Badania.s15 = s15;
    }

    public static void setS16(int s16) {
        Badania.s16 = s16;
    }

    public static void setS17(int s17) {
        Badania.s17 = s17;
    }

    public static void setS18(int s18) {
        Badania.s18 = s18;
    }

    public static void setS19(int s19) {
        Badania.s19 = s19;
    }

    public static void setS20(int s20) {
        Badania.s20 = s20;
    }

    public static void setS21(int s21) {
        Badania.s21 = s21;
    }

    public static void setS22(int s22) {
        Badania.s22 = s22;
    }

    public static void setS23(int s23) {
        Badania.s23 = s23;
    }

    public static void setS24(int s24) {
        Badania.s24 = s24;
    }

  public static String K1,K2,K3,K4,K5,K6,K7,K8; // zmienne przechowujące komunikaty

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
    public void start(Stage primaryStage) throws IOException {
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();*/
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/badania_FX/MainScreen.fxml"));
        StackPane stackPane = loader.load();
        
        Scene scene = new Scene(stackPane);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Program");
        primaryStage.setResizable(true);
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JessException {
        launch(args);
        
     
        
    }
    
}
