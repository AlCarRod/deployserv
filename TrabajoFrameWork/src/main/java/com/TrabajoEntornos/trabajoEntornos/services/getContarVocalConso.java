package com.TrabajoEntornos.trabajoEntornos.services;
import org.springframework.stereotype.Service;


@Service
public class getVocalConso {
    

    public static boolean esVocal(char letra){

        

        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }
    
    public static String getConsonantes(String palabra){
        
        int contConsonantes =0;
        int contVocales =0;
        
        
        int longitudPalabra=palabra.length();

        for (int i = 0; i < longitudPalabra; i++) {
            if(esVocal(palabra.charAt(i))) contConsonantes++;
            else contrVocales++;
        }
        return "El número de consonantes es: " + contConsonantes  +  " y el número de vocales es: " + contVocales;
    }
}
