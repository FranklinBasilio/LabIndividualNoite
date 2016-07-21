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
public class Gato extends Animal{
    public String mia(){
        //System.out.println("mi-a-a-a--u-u-u");
        return "mi-a-a-a-u-u-u-uuu";
    }
    public  String getInfo(){
        return "\n"+getNome()+"\nRaça: "+getRaca()+"\nSom: "+mia();

     }
}
