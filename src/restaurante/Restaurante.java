/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import controller.GestaoMesas;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.FMesas;

/**
 *
 * @author JBP1996 Atec
 */
public class Restaurante extends Application {
    GestaoMesas gMesas;
    
    @Override
    public void start(Stage primaryStage) {
        
        gMesas = new GestaoMesas();
        
        FMesas janela_Mesas = new FMesas(320,240, gMesas);
        
        primaryStage.setScene(janela_Mesas);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
