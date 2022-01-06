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
    
    /**
     *Seleccina una pregunta aleatoria de acuerdo al nivel que esta el participante
     * para obtener la pregunta se pasa aleatoriamente una categoria que proviene del metodo AleatorioCategoria
     * y el nivel proviene del main
     * 
     * @param category es la posicion aleatoria que hace referencia a un categoria
     * @param nivel es el nivel donde esta ubicado el usuario
     * @return retorno la pregunta en string y la posicion de la misma en su array que proviene del BancoPreguntas
     */
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
    
    /**
     *Es el metodo que separa la pregunta de su nivel puesto que el array del Banco de preguntas
     * cuenta con el siguiente formatos "pregunta,nivel" entonces se debe separar o obtener
     * pregunta en una posicion[0] y nivel en una posición [1]
     * 
     * @param cadena es la cadena de string la cual hare la separacion
     * @param separador parametro el cual identificacion donde se hara la separacion ","
     * @return retorna un array donde esta la pregunta  y el nivel de la pregunta
     */
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
        
    /**
     *
     * @return genera un numero aleatorio el cual define la categoria de la pregunta a lanzar en cada ronda
     */
    public int AleatorioCategoria(){
            return aleatorio.nextInt(4);
        }
        
    /**
     *
     * @return retorna la posicion de la pregunta asignada este valor se obtiene en el metodo de getPregunta de esta clase
     */
    public int  PosicionPregunta(){
            return posicion;
        }
    
}
