/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_2;

/**
 *
 * @author Usuario
 */
public class TestSammysRentalPrice4 {
    
    public static void main(String[] args) {
        
        Rental4 renta = new Rental4("A123", 210);
        int tiempo1 = renta.getNumeroSegundos();
        renta.imprimir();
        
        System.out.println("");
        
        Rental4 renta2 = new Rental4("PWL23", 510);
        int tiempo2 = renta2.getNumeroSegundos();
        renta2.imprimir();
        
        System.out.println("");
        
        int horas = renta2.getNumeroHoras();
        do{
            System.out.println("Coupon good for 10 percent off next rental");
            horas--;
        }while(horas > 0);
        
        System.out.println("");
        
        
        
        if(TestSammysRentalPrice4.longerTime(tiempo1, tiempo2) == 1){
            System.out.println("El tiempo mas larga del: " + renta.getNumeroControl());
        }else{
            System.out.println("El tiempo mas larga del: " + renta2.getNumeroControl());
        }
        
        
        
        
    }
    
    public static int longerTime(int n1, int n2){
        if(n1 > n2){
            return 1;
        }
        return 2;
    }
}
