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
public class Animal {
    private String nome;
    private String raca; //raça
    
    //getters
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    //
    public void animal(){
        
    }
    public void animal(String nome){
        
    }
    public boolean caminha(){
        boolean caminha = false;
        return caminha;
        
    }
    //animal(string nome)
    public  String getInfo(){
        return "\n"+getNome()+"\nRaça: "+getRaca();

     }
    
    
}
