package com.TrabajoEntornos.trabajoEntornos.services;

import org.springframework.stereotype.Service;

@Service
public class invertText {
    public static String invertText(String texto) {
        String textoAlReves = "";
        int textoLong = texto.length();
        for (int i = textoLong-1; i >= 0; i--) {
            textoAlReves += texto.charAt(i);
        }
        return textoAlReves;
    }

   
}
