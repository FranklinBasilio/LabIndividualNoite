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
public class CamaroteInferior extends Vip{
    private double ingressoCamaroteInferior;
    private String direitaInferior, esquerdaInferior;
    
     public double getIngressoCamaroteInferior() {
        return ingressoCamaroteInferior;
    }

    public void setIngressoCamaroteInferior(double ingresso) {
        this.ingressoCamaroteInferior = ingresso*0.30+ingresso;
    }
     
     public String imprimeValor(){
        return ""+getValor()+"VIP "+"Camarote Inferior"+getIngressoCamaroteInferior();
    }
}
