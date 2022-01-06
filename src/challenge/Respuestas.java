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
    
    String[]  respuestas3 = {
       "1492","XVI","grecia","Austria","1939"
     };
    
    String[]  respuestas4 = {
       "6","60.50","746640","3.14","doceavo"
     };
    
    String[]  respuestas5 = {
       "8","70%","Portugues","mir","Alemania"
     };
    
    public String getRespuesta(int posicion, int categoria){
        switch (categoria) {
            case 0:
                return respuestas[posicion];
            case 1:
                return respuestas2[posicion];
            case 2:
                return respuestas3[posicion];
            case 3:
                return respuestas4[posicion];
            case 4:
                return respuestas4[posicion];
            default:
                break;
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
        switch (categoria) {
            case 0:
            {
                String  s1 =  banco.opciones[posicion];
                s2=  separar(s1,",");
                return s2;
            }
            case 1:
            {
                String  s1 =  banco.opciones2[posicion];
                s2=  separar(s1,",");
                return s2;
            }
            case 2:
            {
                String  s1 =  banco.opciones3[posicion];
                s2=  separar(s1,",");
                return s2;
            }
            case 3:
            {
                String  s1 =  banco.opciones4[posicion];
                s2=  separar(s1,",");
                return s2;
            }
            case 4:
            {
                String  s1 =  banco.opciones5[posicion];
                s2=  separar(s1,",");
                return s2;
            }
            default:
                break;
        }
        
        return s2;
        
    }

    
    
}
