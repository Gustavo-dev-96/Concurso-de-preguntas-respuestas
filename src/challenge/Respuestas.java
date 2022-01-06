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
    
    /**
     *Este metodo  retorna la respuesta correcta de la pregunta actual 
     * @param posicion la posicion de la respuesta que desean enviar a validación
     * @param categoria identifica a que categoria pertenece la respuesta a buscar
     * @return retorna la respuesta correcta a la pregunta actual
     */
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
                return respuestas5[posicion];
            default:
                break;
        }
        
        return null;
    }
    
    /**
     *Este medoto valida la respuesta del participante con la respuesta verdadera de la pregunta
     * si acierta retorna un true de lo contrario un false
     * 
     * @param usuarioRespuesta respuesta del usuario 
     * @param respuesta corresponde a la respuesta correcta de la pregunta actual
     * @return retorna la resultado de la validacion conociendo si acerto o no
     */
    public boolean getValidar(String usuarioRespuesta, String respuesta){
        if (respuesta.equalsIgnoreCase(usuarioRespuesta)) {
            return true;
        }
        
        return false;
    }
    
    /**
     *Este metodo permite descomponer el array que contiene las respuesta de la pregunta actual
     * permitiendo Seperar cada opcion para luego poder validar cual es la correcta 
     * 
     * @param cadena paso el array que contiene las respuesta con 3 respuestas erroneas y una correcta, total 4
     * @param separador el caracter donde se dividira cada opcion de la cadena de respuesta que esta en el BancoPreguntas
     * @return retorna un array con las 4 opciones separadas tomando cada una, una posicion en el array 
     */
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
    
    /**
     *
     * @param posicion es la posicion en la cual se ubica las respuesta de la pregunta actual en el array del 
     * BancoPreguntas (opciones,opciones2,opciones3...)
     * @param categoria corresponde a la categoria actual de la pregunta esto permite delegar el array correcto que contiene
     * las respuestas de la pregunta.
     * @return retorna el array s2 que contiene las 4 opciones que seran mostras al usuario
     */
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
