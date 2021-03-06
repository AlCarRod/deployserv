package com.TrabajoEntornos.trabajoEntornos.services;

import java.util.ArrayList;

import com.TrabajoEntornos.trabajoEntornos.models.TrabajoFrameModel;
import com.TrabajoEntornos.trabajoEntornos.repositories.TrabajoFrameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrabajoFrameBDservice {

    @Autowired
    TrabajoFrameRepository frameRepository;

    public TrabajoFrameModel saveDatos(TrabajoFrameModel modeloDatos){
        return frameRepository.save(modeloDatos);
    }

    public ArrayList<TrabajoFrameModel> giveDatos(){
        return (ArrayList<TrabajoFrameModel>) frameRepository.findAll();
    }

    
}
