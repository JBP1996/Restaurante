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
public class Cliente {
    int id_cliente;
    String nome;
    String contacto;
    
    public Cliente(int id_cliente,String nome,String contacto){
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.contacto = contacto;
        
    }
}
