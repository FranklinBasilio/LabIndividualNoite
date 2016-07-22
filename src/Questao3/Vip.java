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
public class Vip extends Ingresso{
    //valor adcional em cima de ingresso
    private double adicional= 10.0;

   
    public double getValor() {
        return super.getValor()+adicional; //To change body of generated methods, choose Tools | Templates.
    }
   
     public String imprimeValor(){
        return ""+getValor()+"VIP ";
    }
    
}
