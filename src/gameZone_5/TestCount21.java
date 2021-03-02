/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TestCount21 {
    
    public static void main(String[] args) {
        int guardar;
        int total = 0;
        
        Count21 jugar = new Count21();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Empieza el juego solo puede jugar con 1 al 3");
        
        do{
            do{
                guardar = scanner.nextInt();
                if((guardar<1) || (guardar>3)){
                    System.out.println("Deben ser solo 1, 2 o 3");
                }
            }while((guardar<1) || (guardar>3));
            total = total + guardar;
            
            if(total >= 21){
                if(total > 21){
                    System.out.println("Perdio el Humano porque se paso de 21");
                    break;
                }else{
                    System.out.println("Gano el Humano");
                    break;
                }
            }
            
            total = total + jugar.cp(total);
            if(total >= 21){
                if(total > 21){
                    System.out.println("Perdio la Computadora porque se paso de 21");
                    break;
                }else{
                    System.out.println("Gano la Computadora");
                    break;
                }
            }
            System.out.println("En total va " + total);
        }while(total < 21);
        
        
        
    }
}
