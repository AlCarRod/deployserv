package com.TrabajoEntornos.trabajoEntornos.Controllers;
import com.TrabajoEntornos.trabajoEntornos.services.TraduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TraductorController {
    
    @Autowired
    TraduceService traduceService;

    @RequestMapping("/traducir")
    public  String traducir(@PathVariable String frase, Model modelo){
        String TraducText= traduceService.getTraducir(frase);
        modelo.addAttribute("frase", frase);
        modelo.addAttribute("TraducText", TraducText);
        return "traduccion";
    }

}
