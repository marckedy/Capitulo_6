/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FiveDie2 {

    public static void main(String[] args) {
        int intentar = 0;
        int dado1 = 1;
        int dado2 = 1;
        int decid = 0;
        int total1 = 0;
        int total2 = 0;

        Scanner decidir = new Scanner(System.in);
        Cubilete2 humano = new Cubilete2();
        Cubilete2 computadora = new Cubilete2();
        Random r = new Random();

        do {

            dado1 = 1;
            while ((dado1 != 0) && (dado1 != 2)) {
                System.out.println("HUMANO:");
                humano.lanzar();
                humano.mostrar();

                dado1 = humano.evaluar();

                if (dado1 != 0) {
                    System.out.println("Puedes escoger");
                    System.out.println("1. Seguir jugando");
                    System.out.println("2. Darle el turno a la computadora");
                    decid = decidir.nextInt();

                    total1 = total1 + dado1;

                    if (decid != 1) {
                        dado1 = 0;
                    }
                }
            }

            if (dado1 == 2) {
                total1 = 0;
            }

            if (total1 >= 100) {
                break;
            }

            dado2 = 1;
            while ((dado2 != 0) && (dado2 != 2)) {
                System.out.println("COMPUTADORA:");
                decid = 0;
                computadora.lanzar();
                computadora.mostrar();

                dado2 = computadora.evaluar();

                if (dado2 != 0) {
                    decid = r.nextInt(2);

                    total2 = total2 + dado2;

                    if (decid != 1) {
                        dado2 = 0;
                    }
                }
            }

            if (dado2 == 2) {
                total2 = 0;
            }
            
        } while((total1 < 100) && (total2 < 100));

        if (total1 >= 100) {
            System.out.println("EL ganador es el Humano con ");
            System.out.println(total1 + " puntos");
        } else {
            System.out.print("El ganador es la computadora con ");
            System.out.println(total2 + " puntos");
        }
    }
}
