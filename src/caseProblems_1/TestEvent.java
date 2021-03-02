/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_1;

/**
 *
 * @author Usuario
 */
public class TestEvent {
    
    public static void main(String[] args) {
        
        int num;
        
        Event evento = new Event("PW12",11);
        System.out.println("");
        evento.imprimir();
        System.out.println("");
        
        num = evento.getInvitados();
        do{
            System.out.println("Please come to my event!");
            num--;
        }while(num > 0);
    }
}
