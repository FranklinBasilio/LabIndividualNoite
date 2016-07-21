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
public class Pobre extends Pessoa{
   
    public String trabalha(){
        return "Trabalho mais não saio do canto!";
    }
    
   
   
    @Override
    public String Pessoa(){
        return super.Pessoa()+"\nTrabalha:"+trabalha();
    }

}
