/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

/**
 *
 * @author Usuario
 */
public class Preguntas {
    
    private String preguntas;
    private Respuestas[] respuestas;
    private int indice;
    
    public Preguntas(String preguntas){
        this.preguntas = preguntas;
        this.respuestas = new Respuestas[4];
    }
    
    public void agregarRespuesta(Respuestas r){
        if(indice <= 3){
            this.respuestas[indice] = r;
            indice++;
        }
    }
    
    public boolean contestar( int indice){
        return this.respuestas[indice].getStatus();
    }
    
    public void imprimir(){
        System.out.println(this.getPreguntas());
        for (int i=0; i<4; i++){
            System.out.println(String.format("[%d] %s", i, this.respuestas[i].getText()));
        }
    }
    
    

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }
    
    
}
