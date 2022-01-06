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

                 String preg = p.getPregunta(res,nivel);
                 int posicion = p.PosicionPregunta();
                 
                 boolean result = false;
         
                if (preg != null) {
            
                    String[] resp = r.setRespuesta(posicion,res);
                
                    if (resp != null) {
                        System.out.println(preg + "\n"+ Arrays.toString(resp));
                        String respUsuario = leer.next();

                        String correcta =  r.getRespuesta(posicion, res);

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
             
                if(result){
                   
                    score = puntaje(nivel);
                    if (nivel <5) {
                        System.out.println("\n Hasta el momento tienes " + score+ " puntos \n ");
                    }else{
                        System.out.println("\n Finalizaste tu puntaje es de  " + score+ "\n ");
                    }
                     nivel++;
                     
                     
                }else{
                    puntos = 0;
                    System.out.println("\n Haz perdido, Tu puntaje es "+ puntos + "\n");
                    break;
                }
                
                System.out.println("\n Desea continuar ? Si/No  \n " );
                String validar =leer.next();
                
                if ("no".equalsIgnoreCase(validar)) {
                        break;
                 }
        }
        
       
    }
    
    /**
     *
     * @param nivel
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
