/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author JBP1996 Atec
 */
public class FMesas extends Scene{
    
    Group gn;
    public FMesas(double width,double height){
        super(new Group(), width,height);
        gn = (Group) this.getRoot();
        init();
    }
    
    private void init(){
        GridPane g = new GridPane();
        
        Label lbl1 = new Label("Lotacao");
        CheckBox c = new CheckBox("Fumador");
        TextField nf = new TextField();
        Button bt = new Button("Adicionar");
        
        g.add(lbl1, 0, 0);
        g.add(nf, 1, 0);
        g.add(c, 0, 1);
        g.add(bt, 1, 2);
        
        gn.getChildren().add(g);
    }
}
