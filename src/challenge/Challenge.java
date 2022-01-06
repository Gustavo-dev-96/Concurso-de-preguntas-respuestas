/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gusta
 */
public class Challenge {
    
    private  static ArrayList <Participante> jugador;
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        jugador = new ArrayList<>();
        
        Scanner  lectura  = new Scanner(System.in);
        
        
        int select=0;
        String nombre=null;
        int puntaje =0;
        
        do{
            System.out.println("Bienvenido al concurso de Preguntas & Respuestas \n"
                + "Debes escribir 1 de las 4 opciones que acompaña cada pregunta y una de ellas es la correcta  \n"
                +"Si responde de manera incorrecta perderas tu puntuación \n\n"
                +"Selecciona alguna de las siguientes opciones \n"
                +"1. Iniciar Concurso\n" 
                +"2. Ranking de usuarios\n"
                +"3. Finalizar");
            
             select = Integer.parseInt(lectura.next());
             
             
            
            switch(select){
                case 1:
                        System.out.println("\n Ingrese su numbre \n");
                        nombre = lectura.next();
                        
                        proceso init = new proceso();
                        //Agrega al participante en el historial
                        puntaje =  init.puntos;
                        AgregarJugador(nombre,puntaje);
                    break;
                case 2:
                    System.out.println("\n Ranking de participantes");
                    VisualizarRegistros();
                    System.out.println("\n \n");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            
            
        
        }while(select !=3);
        
        
        
        
    }
    
     static void AgregarJugador(String nombre, int puntaje){
        Participante participante = new  Participante(nombre,puntaje);
        jugador.add(participante);
    }
     
     static  void  VisualizarRegistros(){
        for (int i = 0; i < jugador.size(); i++) {
               System.out.println("Nombre: " +jugador.get(i).getNombre() + " / puntaje: " + jugador.get(i).getPuntaje());
        }
     }
    
}
