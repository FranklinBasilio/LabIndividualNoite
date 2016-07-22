/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

/**
 *
 * @author usuario
 */
public class Ingresso {
    private double valor= 100.0;

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
   // public String imprimeValor(double ingresso){
    //    return ""+ingresso;
   // }

    public String imprimeValor(){
        return ""+getValor();
    }
     
    

    
}
