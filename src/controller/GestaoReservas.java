/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Cliente;
import model.Mesa;
import model.Reserva;

/**
 *
 * @author JBP1996 Atec
 */
public class GestaoReservas {
    ArrayList <Reserva> _reservas;
    
    public GestaoReservas(){
        _reservas = new ArrayList<>();
        
    }
    
    public void addReserva(Cliente c, Mesa m, String hora,int npessoas){
        Reserva res = new Reserva(_reservas.size(),npessoas,c,m,hora);
        _reservas.add(res);
        
    }
}
