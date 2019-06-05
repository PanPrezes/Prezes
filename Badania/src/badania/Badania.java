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
    
    public static int a2,a3,a5,a6,b2,b3,b4,b5,b8,c2,c3,c4,d2,d4,e3,e4,e6,e7,e8,f3,f4,f7,f8,g3,g7,g8,h8,i8,j8,k8,l8,m8;

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
