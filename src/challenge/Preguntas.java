/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author Gusta
 */
public class Preguntas {
    BancoPreguntas banco = new BancoPreguntas();
    
     Random  aleatorio  = new Random();
    
    String[] categoria ={
        "Geografia",
        "Ciencia",
        "Historia",
        "Matematicas",
        "Cultura General",
    };
    
    int posicion=0;
    
    public String getPregunta( int category, int nivel){

        String pregunta = null;
        switch (category) {
            case 0:
                for (int i = 0; i < banco.preguntas.length; i++) {
                    String  s1 = banco.preguntas[i];
                    String[] s2 = separarPregunta(s1,",");
                    int level = Integer.parseInt(s2[1]);
                    
                    if ( level == nivel) {
                        pregunta = s2[0];
                        posicion = i;
                    }
                }   break;
            case 1:
                for (int i = 0; i < banco.preguntas2.length; i++) {
                    String  s1 = banco.preguntas2[i];
                    String[] s2 = separarPregunta(s1,",");
                    int level = Integer.parseInt(s2[1]);
                    
                    if ( level == nivel) {
                        pregunta = s2[0];
                        posicion = i;
                    }
                }   break;
            case 2:
                for (int i = 0; i < banco.preguntas3.length; i++) {
                    String  s1 = banco.preguntas3[i];
                    String[] s2 = separarPregunta(s1,",");
                    int level = Integer.parseInt(s2[1]);
                    
                    if ( level == nivel) {
                        pregunta = s2[0];
                        posicion = i;
                    }
                }   break;
             case 3:
                for (int i = 0; i < banco.preguntas4.length; i++) {
                    String  s1 = banco.preguntas4[i];
                    String[] s2 = separarPregunta(s1,",");
                    int level = Integer.parseInt(s2[1]);
                    
                    if ( level == nivel) {
                        pregunta = s2[0];
                        posicion = i;
                    }
                }   break;
                
               case 4:
                for (int i = 0; i < banco.preguntas5.length; i++) {
                    String  s1 = banco.preguntas5[i];
                    String[] s2 = separarPregunta(s1,",");
                    int level = Integer.parseInt(s2[1]);
                    
                    if ( level == nivel) {
                        pregunta = s2[0];
                        posicion = i;
                    }
                }   break;
            default:
                break;
        }
        
        return pregunta;
    }
    
    
        public String[] separarPregunta(String cadena, String separador){
            StringTokenizer token = new StringTokenizer(cadena, separador);
            String[] PreguntaNivel = new  String [2];
        
            int i = 0;
        
            while(token.hasMoreTokens()){
                PreguntaNivel[i] = token.nextToken();
                i++;
            }
            return PreguntaNivel;
        }  
        
        public int AleatorioCategoria(){
            return aleatorio.nextInt(4);
        }
        
        public int  PosicionPregunta(){
            return posicion;
        }
    
}
