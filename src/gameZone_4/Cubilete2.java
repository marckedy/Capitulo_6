/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

/**
 *
 * @author Usuario
 */
public class Cubilete2 {
    
    private Die2[] dados;
    
    public Cubilete2(){
        this.dados = new Die2[2];
        for(int i=0; i<2;i++){
            this.dados[i]=new Die2();
        }
    }
    
    public void lanzar(){
        for(int i=0; i<2; i++){
            this.dados[i].Lanzar();
        }
    }
    
    public void mostrar(){
        for(int i=0; i<2; i++){
            System.out.print(this.dados[i].getDado() + " ");
        }
        System.out.println("");
    }
    
    public int evaluar(){
        int suma = 0;
        
        for(int i=0; i<2; i++){
            if(this.dados[i].getDado() == 1){
                return 0;
            }
            suma = suma + this.dados[i].getDado();
        }
        return suma;
    }
}
