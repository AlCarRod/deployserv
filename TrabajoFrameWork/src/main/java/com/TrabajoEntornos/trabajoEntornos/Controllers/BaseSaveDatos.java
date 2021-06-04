package com.TrabajoEntornos.trabajoEntornos.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseSaveDatos {
    
    @RequestMapping("/darDatos")
    public String darDatos(){
        return "darDatos";
    }
}
