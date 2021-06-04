package com.TrabajoEntornos.trabajoEntornos.Controllers;

import java.util.Map;

import com.TrabajoEntornos.trabajoEntornos.models.TrabajoFrameModel;
import com.TrabajoEntornos.trabajoEntornos.services.getVocalConso;
import com.TrabajoEntornos.trabajoEntornos.services.TrabajoFrameBDservice;
import com.TrabajoEntornos.trabajoEntornos.services.invertText;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TrabajoController {

    @Autowired
    ContarVocalConso cnt;

    @GetMapping("/")
    public String resumen() {
        return "Hola, bienvenido a mi aplicación" + 
        
        
        "Funciones a realizar:" +
        

        "- Enumeración de consonantes y vocales que tiene. Para contarlas introduzca: /getVocalConso" +
        
      

        "- Guardar datos: '/saveDatos'" + 
        
        
        
        "- Relacion datos, escribe: '/relacionDatos'" +
        

        "- Para mostar frase al revés, escribe: /invertText ";
    }


    @GetMapping("getVocalConso")
    public String getVocalConso(@PathVariable String palabra) {
        String resultado = getVocalConso.getConsonantes(palabra);
        return resultado;
    }

    @GetMapping("/cnt1")
    public String cnt1() {
        return "hola";
    }

    @Autowired
    TrabajoFrameBDservice trabajoBDservice;

    @PostMapping("/saveDatos")
    public String saveDatos(@RequestParam Map<String, String> body) {
        System.out.println(body.get("datos"));
        TrabajoFrameModel trabajoModel = new TrabajoFrameModel();
        trabajoModel.setDato(body.get("datos"));
        trabajoBDservice.saveDatos(entornosModel);
        return "Datos guardados.";

    }

    @GetMapping("/relacionDatos")
    public String relacionDatos() {
        return trabajoBDservice.giveDatos().toString();
    }


    
    @GetMapping("/invertText")
    public String invertText(@PathVariable String texto){
        String invertText = changeFrase.invertText(texto);
        return  "- La frase al revés es: " + invertText;
    }
}
