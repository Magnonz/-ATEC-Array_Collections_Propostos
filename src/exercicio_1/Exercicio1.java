/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Magnon
 */
public class Exercicio1 {
    
    public Exercicio1(){
        
        ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();
        
        int cont=0,opt=0; 
        
        do{
        System.out.println("1-Inserir Pessoa");
        System.out.println("2-Listar Pessoas");
        System.out.println("3-Pesquisa Pessoa");
        System.out.println("4-Apagar Pessoa");
        System.out.println("0-Sair");
        opt=new Scanner(System.in).nextInt();            
            
      
        
        switch(opt){
            case 1:
                if(cont<10){
                    insert_pessoa(pessoas,cont);
                    cont++;
                }else
                    System.out.println("Já não pode introduzir mais pessoas");
                break;
            
            case 2:
                if(cont>0)
                    list_pessoa(pessoas,cont);
                else
                    System.out.println("A base de dados nao contem pessoas");
                break;
            case 3:
                    search_pessoa(pessoas,cont);
                break;
                
            case 4:
                delete_pessoa(pessoas,cont);
                cont--;
                break;
            default:
                System.out.println("Introduza uma opçao valida");
                break;
        }
        
          }while(opt!=0);  
            
  
        
    }
    public void insert_pessoa(ArrayList <Pessoa> pessoas, int cont){
        
        
    int id_temp;
    String nome_temp;
    int idade_temp;
    String telefone_temp;
    float saldo_temp;
    
    System.out.println("Intruduza o nome");
    nome_temp=new Scanner(System.in).nextLine();
    
    System.out.println("Intruduza a idade");
    idade_temp=new Scanner(System.in).nextInt();
    
    System.out.println("Intruduza o telefone");
    telefone_temp=new Scanner(System.in).nextLine();
    
    System.out.println("Intruduza o saldo");
    saldo_temp=new Scanner(System.in).nextFloat();
    
    Pessoa pessoa_temp=new Pessoa(cont,nome_temp,idade_temp,telefone_temp,saldo_temp);
    pessoas.add(pessoa_temp);
    
    cont+=1;
  
    }
    
    public void list_pessoa(ArrayList<Pessoa> pessoas, int cont){
        
        for(int i=0;i<cont;i++){
        System.out.println("ID      - " + pessoas.get(i).getId());
        System.out.println("Nome    - " + pessoas.get(i).getNome());
        System.out.println("Idade   - " + pessoas.get(i).getIdade());
        System.out.println("Telefone- " + pessoas.get(i).getTelefone());
        
            
            
        }
        
    }
    
    public void search_pessoa(ArrayList <Pessoa> pessoas,int cont){
        
                
        System.out.print("Introduza nome que quer procurar: ");
        String name_temp= new Scanner(System.in).nextLine();
        
        
        for(int i=0;i<cont;i++){
            
            if(name_temp.equals(pessoas.get(i).getNome())){
                  System.out.println("ID    - " + pessoas.get(i).getId());
                  System.out.println("Nome    - " + pessoas.get(i).getNome());
                  System.out.println("Idade   - " + pessoas.get(i).getIdade());
                  System.out.println("Telefone- " + pessoas.get(i).getTelefone());
                  return;
                                
            }
                      
            
        }    
        
    }
    
    public void delete_pessoa(ArrayList <Pessoa> pessoas,int cont){
        
        
        System.out.print("Introduza nome que quer apagar: ");
        String name_temp= new Scanner(System.in).nextLine();
        
           for(int i=0;i<cont;i++){
           
                if(name_temp.equals(pessoas.get(i).getNome())){
                                   
                    pessoas.remove(i);
                                   
                    return;
                }
           
           }
        
    }
    
}
