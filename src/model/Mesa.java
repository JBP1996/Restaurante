/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JBP1996 Atec
 */
public class Mesa {
    int id_mesa;
    int lugares;
    boolean fumador;
    
    public Mesa(int id_mesa,int lugares,boolean fumador){
        this.id_mesa = id_mesa;
        this.lugares = lugares;
        this.fumador = fumador;
        
    }
}
