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
    
    public proceso() {
            Scanner  leer  = new Scanner(System.in);

         Respuestas r = new Respuestas();
         Preguntas p = new Preguntas();
          int nivel = 1;
          
         
        
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
                            System.out.println("Excelente, tu respuesta es correcta. \n" + "Avanzas al nivel " + (nivel+1));
                        }
                    }

                }else{
                    System.out.println("No hay datos");
                }
             
                if(result){
                    nivel++;
                }else{
                    System.out.println("Tu puntaje es 0, haz perdido" );
                    break;
                }
        }
    }
    
}
