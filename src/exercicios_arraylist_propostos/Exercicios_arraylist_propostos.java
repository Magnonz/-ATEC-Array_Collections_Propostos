/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_arraylist_propostos;

import exercicio_1.*;
import exercicio_2.Exercicio2;
import java.util.Scanner;

/**
 *
 * @author Magnon
 */
public class Exercicios_arraylist_propostos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc=0;
        
        do{
            
            System.out.println("Escolha um exercicio");
            System.out.println("1 - Exercicio 1 (Pessoas)");
            System.out.println("2 - Exercicio 2 (Media das Idades)");
            System.out.println("0 - Sair ");
            System.out.print("Escolha : ");
            
            opc=new Scanner(System.in).nextInt();
            
            
            switch(opc){
                case 1:
                new Exercicio1();
                break;
                
                case 2:
                new Exercicio2();
                break;
                
                case 0:
                System.out.println("Encerrar o programa ...");
                    
                    
                
            }
            
        }while(opc!=0);
        
        
    }
    
}
