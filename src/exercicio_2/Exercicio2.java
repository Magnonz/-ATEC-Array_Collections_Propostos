/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rui Santana
 */
public class Exercicio2 {
    
    
    public Exercicio2(){
     
    ArrayList <Integer> idades=new ArrayList <>();
    int age;
    
    for(int i=0;i<5;i++){
        System.out.println("Intruduza a idade da "+i+"º pessoa");
        age=new Scanner(System.in).nextInt();
        idades.add(age);       
    }
    age=0;
    for(int i=0;i<5;i++){
        age+=idades.get(i);        
    }
     System.out.println("A media das idade é "+age/5); 
    
    
}  
    
}
