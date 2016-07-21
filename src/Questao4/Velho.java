/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

/**
 *
 * @author usuario
 */
public class Velho extends Imovel{
    //desconto de preço
    //criar metodos de acesso e impressao
     private double desconto=0.25;
   // public double getDesconto() {
     //   return desconto;
    //}

    public double setPreco(double preco) {
        return this.desconto = preco*desconto;
    }
    
    

    public String getInfo(){
		return super.getEndereco()+"\nPreço: "+super.getPreco()-desconto;
	}

    
}
