/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Mesa;

/**
 *
 * @author JBP1996 Atec
 */
public class GestaoMesas {
    ArrayList <Mesa> _armesas;
    public GestaoMesas(){
        _armesas = new ArrayList <>();
    }
    
    public void addMesa(int lugares,boolean fumador){
        Mesa m = new Mesa(lugares, _armesas.size(),fumador);
        _armesas.add(m);
    }
}
