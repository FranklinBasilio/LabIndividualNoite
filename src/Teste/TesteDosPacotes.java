/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

/**
 *
 * @author Franklin
 */
//import Questao2.Cachorro;
//import Questao2.Gato;
//import Questao2.Miseravel;
//import Questao2.Pessoa;
//import Questao2.Pobre;
//import Questao2.Rica;
import Questao2.*;
import Questao3.*;
import Questao4.*;
import java.util.Scanner;

public class TesteDosPacotes {
    public static void main(String[] args){
         
       // animais/
        Animal   anim = new Animal();
        Cachorro anim2 = new Cachorro();
        Gato     anim3 = new Gato();
       
        anim.setNome("Wiska");
        anim.setRaca("Sem raça");
       
        anim2.setNome("Snoopy");
        anim2.setRaca("Biggle");
        anim2.late();
        
        anim3.setNome("Natasha");
        anim3.setRaca("Siames");
        anim3.mia();
        
        Populacao animais = new Populacao();
        animais.adiciona(anim);
        animais.adiciona(anim2);
        animais.adiciona(anim3);
        
        System.out.println("\n*******************************\n");
         
        // Pessoas - ricas pobre miseraveis
        Pessoa pessoa1 = new Pessoa();
        Rica pessoa2 = new Rica();
        Pobre pessoa3 = new Pobre();
        Miseravel pessoa4 = new Miseravel();
        
        
        pessoa1.setNome("João estrela");
        pessoa1.setIdade(30);
        
        pessoa2.setNome("Pedro Cunha");
        pessoa2.setIdade(25);
        pessoa2.setDinheiro(3500);
        pessoa2.fazCompras();
        
        pessoa3.setNome("Margarida Flores");
        pessoa3.setIdade(45);
        pessoa3.trabalha();
        
        pessoa4.setNome("Rosa Mata");
        pessoa4.setIdade(45);
        pessoa4.mendiga();
    
       Populacao populacao = new Populacao();
       populacao.adiciona(pessoa1);
       populacao.adiciona(pessoa2);
       populacao.adiciona(pessoa3);
       populacao.adiciona(pessoa4);
       
		
	//*******************************************//
	
        Imovel imovel = new Imovel();
        imovel.setEndereco("Rua do Nascimento, Bairro Olinda");
        imovel.setPreco(200.00);
        
        System.out.println("\nCaro usuário se desejar um imóvel:\nNovo - tecle (1)\nVelho - tecle (2)\n");
        Scanner sc = new Scanner(System.in);
        int escolha;
        
        do{
            escolha = sc.nextInt();
        }while(escolha!=1 && escolha !=2);
        
        
            if(escolha==1){
                System.out.println("\nNovo: "+imovel.getInfo());
            }else{
                if(escolha==2){
                    System.out.println("\nVelho: "+imovel.getInfo());
                }else{
                    System.out.println("Escolha errada");
                }
            }
        
        //****************************************INGRESSOS
        System.out.println("\n*************** INGRESSOS **************************\n");
        Ingresso ingresso = new Ingresso();
        ingresso.setValor(100.0);
        System.out.println("\nIngresso:\nNormal - tecle (1)\nVIP - tecle (2)\n");
        Scanner in = new Scanner(System.in);
        int opcaoIngresso;
        
        do{
            opcaoIngresso = in.nextInt();
        }while(opcaoIngresso!=1 && opcaoIngresso !=2);
        
        if(opcaoIngresso==1){
                System.out.println("\n>>> : "+ingresso.imprimeValor());
            }else{
                if(opcaoIngresso==2){
                   do{
                       System.out.println("\nDeseja Camarote ...:\nSuperior - tecle (1)\nInferior - tecle (2)\n");
                         opcaoIngresso = in.nextInt();
                         }while(opcaoIngresso!=1 && opcaoIngresso !=2);
                         if(opcaoIngresso==1){
                             //camaroteSuperior
                         }else{
                             if(opcaoIngresso==2){
                                 //camaroteInferior
                             }else{
                                  System.out.println("Escolha errada");
                             }
                         }
                    
                }else{
                    System.out.println("Escolha errada");
                }
            }
         
    }
}
