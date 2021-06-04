package com.TrabajoEntornos.trabajoEntornos.repositories;
import com.TrabajoEntornos.trabajoEntornos.models.TrabajoFrameModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository


public interface TrabajoFrameRepository extends CrudRepository<TrabajoFrameModel,Long>{
    
}
