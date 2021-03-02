/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Quiz {
    
    private Preguntas[] preguntas;
    
    public Quiz(){
        this.preguntas = new Preguntas[10];
        
        this.preguntas[0] = new Preguntas("¿De que color es el cielo?");
        this.preguntas[0].agregarRespuesta(new Respuestas("Verde", false));
        this.preguntas[0].agregarRespuesta(new Respuestas("Rojo", false));
        this.preguntas[0].agregarRespuesta(new Respuestas("Azul", true));
        this.preguntas[0].agregarRespuesta(new Respuestas("Amarillo", false));
        
        this.preguntas[1] = new Preguntas("¿Que son las vacas?");
        this.preguntas[1].agregarRespuesta(new Respuestas("Animales", true));
        this.preguntas[1].agregarRespuesta(new Respuestas("Unos calsetines", false));
        this.preguntas[1].agregarRespuesta(new Respuestas("Figuras geometricas", false));
        this.preguntas[1].agregarRespuesta(new Respuestas("Un vaso caro", false));
        
        this.preguntas[2] = new Preguntas("¿Cual de estas es una comida mexicana?");
        this.preguntas[2].agregarRespuesta(new Respuestas("Shushi", false));
        this.preguntas[2].agregarRespuesta(new Respuestas("Ramen", false));
        this.preguntas[2].agregarRespuesta(new Respuestas("Hamburguesa", false));
        this.preguntas[2].agregarRespuesta(new Respuestas("Mole", true));
        
        this.preguntas[3] = new Preguntas("¿Cual de las siguientes está bien dicha?");
        this.preguntas[3].agregarRespuesta(new Respuestas("Queso Oaxaca", false));
        this.preguntas[3].agregarRespuesta(new Respuestas("Quesillo", true));
        this.preguntas[3].agregarRespuesta(new Respuestas("Oaxaca queso", false));
        this.preguntas[3].agregarRespuesta(new Respuestas("Queso de Oaxaca", false));
        
    }
    
    public Preguntas getPregunta(int indice){
        return this.preguntas[indice];
    }
    
    
    public static void main(String[] args) {
        
        Quiz.evaluar(0);
        Quiz.evaluar(1);
        Quiz.evaluar(2);
        Quiz.evaluar(3);
        
    }
    
    public static void evaluar(int evaluar){
        
        Quiz quiz = new Quiz();
        
        int indice = 0;
        int resp;
        
        Preguntas p = quiz.getPregunta(evaluar);
        
        
        do{
            resp = 0;
            p.imprimir();
        
            Scanner scanner = new Scanner(System.in);
            int respuesta = scanner.nextInt();
        
            if (p.contestar(respuesta)){
              System.out.println("Correcto");
              resp = 1;
            }else{
             System.out.println("Incorrecto");
            }
            indice++;
        }while((indice < 3) && (resp != 1));
    }
}
