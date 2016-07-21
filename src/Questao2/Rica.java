/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author usuario
 */
public class Rica extends Pessoa{
    private double dinheiro=0.0;

    public double getDinheiro(double dinheiro) {
        return dinheiro;
    }
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    public String fazCompras(){
        return "Simbora gastar dinheiro no Shooping";    
    //System.out.println("Vive gastando o dinheiro que não sabe como ganhou");
    }
    @Override
    public String Pessoa(){
        return super.Pessoa()+"\nDinheiro: "+getDinheiro(dinheiro)+"\n Rico: "+fazCompras();
    }

    

   
}
