/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TestRandomGuess3 {
    
    public static void main(String[] args) {
        
        int numero;
        int numeroAleatorio;
        int intentos = 0;
        
        RandomGuess3 player = new RandomGuess3();
        player.numeroRandom();
        numeroAleatorio = player.getNumero();
        
        Scanner jugar = new Scanner(System.in);
        
        System.out.println("Adivina el numero, tienes 6 intentos");
        
        do{
            numero = jugar.nextInt();
            TestRandomGuess3.evaluarNumero(numero, numeroAleatorio);
            intentos++;
            
        }while(numeroAleatorio != numero);
        
        System.out.println("Lo intentastes " + intentos + " veces");
    }
    
    public static void evaluarNumero(int numero, int numeroAleatorio){
        if(numero < numeroAleatorio){
            System.out.println("Es un numero más grande");
        }else{
            if(numero > numeroAleatorio){
                System.out.println("Es un numero mas pequeño");
            }else{
                System.out.println("Correcto");
            }
        }
    }
}
