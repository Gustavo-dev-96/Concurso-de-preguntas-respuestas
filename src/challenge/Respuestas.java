/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.util.StringTokenizer;

/**
 *
 * @author Gusta
 */
public class Respuestas {
    
    BancoPreguntas banco = new BancoPreguntas();
    
    String[]  respuestas = {
       "ottawa","vaticano","nilo","Asia","Rusia"
     };
    
    String[]  respuestas2 = {
       "mamifero","tierra","Atmosfera","Zoologia","guepardo"
     };
    
    
    public String getRespuesta(int posicion, int categoria){
        if (categoria == 0) {
            return respuestas[posicion];
        }else if (categoria == 1){
            return respuestas2[posicion];
        }
        
        return null;
    }
    
    public boolean getValidar(String usuarioRespuesta, String respuesta){
        if (respuesta.equalsIgnoreCase(usuarioRespuesta)) {
            return true;
        }
        
        return false;
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena, separador);
        String[] a = new  String [4];
        
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken();
            i++;
        }
        
        return a;
    }
    
    public String[]  setRespuesta (int  posicion, int categoria){
        String[] s2 = null;
        if (categoria == 0) {
            String  s1 =  banco.opciones[posicion];
            s2=  separar(s1,",");
            return s2;
        }else if(categoria == 1){
            String  s1 =  banco.opciones2[posicion];
            s2=  separar(s1,",");
            return s2;
        }
        
        return s2;
        
    }

    
    
}
