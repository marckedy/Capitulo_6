/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_5;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Count21 {
    int jugador;
    int cp;

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }


    public int cp(int num) {
        Random random = new Random();
        this.cp = random.nextInt(3)+1;
        switch(num){
            case 15: this.cp = 2; break;
            case 16: this.cp = 1; break;
            case 17: this.cp = 1; break;
            case 18: this.cp = 3; break;
            case 19: this.cp = 2; break;
            case 20: this.cp = 1; break;
        }
        return this.cp;
    }
    
    
}
