/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Dados3 {
    
    private int numero;
    private int numero2;
    
    
    public int getNumero1(){
        return this.numero;
    }
    
    public int getNumero2(){
        return this.numero2;
    }
    
    public void Lanzar(){
        Random r = new Random();
        int aleatorio = r.nextInt(6)+1;
        int aleatorio2 = r.nextInt(6)+1;
        this.numero = aleatorio;
        this.numero2 = aleatorio2;
    }
    
    public int Adivinar(){
        return 1;
    }
}
