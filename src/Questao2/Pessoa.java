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
public class Pessoa {

    
    private String nome;
    private int idade;
   // private String pessoa;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
     public  String Pessoa(){
        return "\n"+getNome()+"\nIdade: "+getIdade();

     }
     public void adiciona(Pessoa p){
		System.out.println(p.Pessoa());
	
	}
}
