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
public class Novo extends Imovel{
    //adcional de preco
    private double adicional;
    public double setPreco(double preco) {
       return this.adicional = preco*0.3;
    }
    //acesso aos metodos e impressao deste valor adcional
   // public String getInfo(){
	//	return super.getEndereco()+" Preço: "+super.getPreco()+adicional;
	//}
    
    public String getInfo(){
		return this.getEndereco()+"\nPreço: "+this.getPreco()+adicional;
	}

}
