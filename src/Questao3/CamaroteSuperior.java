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
public class CamaroteSuperior extends Vip{
    //acrescimo de valor
    private double ingressoCamarote;
    private String direitaSuperior, esquerdaSuperior,centroSuperior;

    public double getIngressoCamarote() {
        return ingressoCamarote;
    }

    public void setIngressoCamarote(double ingresso) {
        this.ingressoCamarote = ingresso*0.60+ingresso;
    }
    
    
     public String imprimeValor(){
        return ""+getValor()+" VIP "+"Camarote Superior"+getIngressoCamarote();
    }
     
   
}
