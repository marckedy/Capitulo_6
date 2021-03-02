/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class RandomGuess3 {
    
    private int numero;
    private int jugador;

    public int getNumero() {
        return this.numero;
    }

    public void numeroRandom() {
        Random n = new Random();
        this.numero = n.nextInt(1000)+1;
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }
}
