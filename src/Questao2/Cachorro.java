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
public class Cachorro extends Animal{
    public String late(){
       //return System.out.println("au au au");
       return "au au" ;
    }
    
    public  String getInfo(){
        return "\n"+getNome()+"\nRaça: "+getRaca()+"\nSom: "+late();

     }
}
