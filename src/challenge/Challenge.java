/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gusta
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  opcion  = new Scanner(System.in);
        
        System.out.println("Bienvenido al concurso de Preguntas & Respuestas \n"
                + "Debes escribir 1 de las 4 opciones que acompaña cada pregunta y una de ellas es la correcta  \n"
                +"Si responde de manera incorrecta perderas tu puntuación \n\n"
                +"Selecciona alguna de las siguientes opciones \n"
                +"1. Iniciar Concurso\n" 
                +"2. ranking de usuarios");
        
        int select = Integer.parseInt(opcion.next());
        
        
        switch(select){
            case 1:
                    proceso init = new proceso();
                    
                break;
            case 2:
                System.out.println("Ranking de participantes");
                break;
        }
        
        
    }
    
}
