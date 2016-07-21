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
public class Miseravel extends Pessoa{
    
    
    public String mendiga(){
        return "Dê uma esmolinha!!";
    }
    
     @Override
    public String Pessoa(){
        return super.Pessoa()+"\nMendiga:"+mendiga();
    }
}
