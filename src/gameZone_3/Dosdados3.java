/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Dosdados3 {
    public static void main(String[] args) {
        int intentos = 0;
        int num1;
        int num2;
        int num;
        int jugador;
        
        Dados3 dados = new Dados3();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adiva la suma de los daso del 2 al 12");
        jugador = scanner.nextInt();
        System.out.println("");
        
        do{
            dados.Lanzar();
        
            num1 = dados.getNumero1();
            num2 = dados.getNumero2();
        
            num=num1+num2;
        
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("");
            intentos++;
        }while((intentos < 3) && (num != jugador));
        
        if(num == jugador){
            System.out.println("Gano el jugador");
        }else{
            System.out.println("Gano la computadora");
        }
    }
}
