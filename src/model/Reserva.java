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
public class Reserva {
    int id_reserva;
    int n_pessoas;
    Cliente cliente;
    Mesa mesa;
    String date;
    
    public Reserva(int id_reserva, int n_pessoas, Cliente cliente, Mesa mesa, String date){
        this.id_reserva = id_reserva;
        this.n_pessoas = n_pessoas;
        this.cliente = cliente;
        this.mesa = mesa;
        this.date = date;
        
    }
}
