/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gusta
 */
public class proceso {
        int puntos= 0;
        String name = null;
     
     
    public proceso() {
          Scanner  leer  = new Scanner(System.in);

          //Instanciando las clases
         Respuestas r = new Respuestas();
         Preguntas p = new Preguntas();
        
         
          int nivel = 1;
          int score =0;
         
        
        while(nivel <= 5){
                   //Categoria aleatoria
                  int res = p.AleatorioCategoria();
                  //Nombre de la categoria
                  String categoria = p.categoria[res];
                  
                  System.out.println("Categoria " + categoria + " Nivel " + nivel);
                  
                  //Pregunta y posicion de la pregunta
                 String preg = p.getPregunta(res,nivel);
                 int posicion = p.PosicionPregunta();
                 
                 boolean result = false;
                 // valida si viene una pregunta
                if (preg != null) {
                    //Traen las opciones de respuesta
                    String[] resp = r.setRespuesta(posicion,res);
                
                    if (resp != null) {
                        System.out.println(preg + "\n"+ Arrays.toString(resp));
                        String respUsuario = leer.next();
                        //Trae la respuesta correcta
                        String correcta =  r.getRespuesta(posicion, res);
                        //validad si la respuesta del usuario es correcta o incorrecta
                        result = r.getValidar(respUsuario, correcta);

                        if (result) {
                            if (nivel <= 5) {
                                if(nivel == 5){
                                        System.out.println("\n Excelente, tu respuesta es correcta. \n");
                                    }else{
                                    System.out.println("\n Excelente, tu respuesta es correcta. \n" + "Avanzas al nivel " + (nivel+1) + "\n");
                                }
                                 
                            }
                        }
                    }

                }else{
                    System.out.println("No hay datos");
                }
                //Puntuación
                if(result){
                   
                    score = puntaje(nivel);
                    if (nivel <5) {
                        System.out.println("\n Hasta el momento tienes " + score+ " puntos \n ");
                        // Validad si el usuario quiere continuar o no 
                        System.out.println("\n Desea continuar ? Si/No  \n " );
                        String validar =leer.next();

                        if ("no".equalsIgnoreCase(validar)) {
                               System.out.println("\n Finalizaste tu puntaje es de  " + score+ "\n ");
                                break;
                         }
                    }else{
                        System.out.println("\n Finalizaste tu puntaje es de  " + score+ "\n ");
                    }
                     nivel++;
                     
                     
                }else{
                    puntos = 0;
                    System.out.println("\n Haz perdido, Tu puntaje es "+ puntos + "\n");
                    break;
                }
                
                
        }
        
       
    }
    
    /**
     *
     * @param nivel se pasa el nivel en el que esta el usuario para otorgar el puntaje correspondiente
     */
    public int  puntaje(int nivel){
        
        switch(nivel){
            case 1:
                    puntos = puntos + 10;
                break;
            case 2:
                    puntos = puntos + 20;
                break;
            case 3:
                    puntos = puntos +30;
                break;
            case 4:
                    puntos = puntos + 40;
                break;
                
            case 5:
                    puntos = puntos + 50;
                break;
            
        }
        
        return puntos;
    }
    
    
}
