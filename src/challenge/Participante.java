/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.util.ArrayList;

/**
 *
 * @author Gusta
 */
public class Participante {

     private String nombre;
     private int puntaje;
     
     public Participante(String nombre, int puntaje){
         this.nombre = nombre;
         this.puntaje = puntaje;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
        
}
