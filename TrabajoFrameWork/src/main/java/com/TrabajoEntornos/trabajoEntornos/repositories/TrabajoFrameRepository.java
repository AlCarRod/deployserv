package com.TrabajoEntornos.trabajoEntornos.repositories;
import com.TrabajoEntornos.trabajoEntornos.models.TrabajoEntornosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

/*se le indica el modelo con el que se va a trabajar y el tipo de la clave primaria*/
/*CrudRepository (el JPA) va a encargarse de hacer las consultas de forma automática
si se necesitaran hacer consultas más complejas, se pueden añadir de forma manual*/
public interface TrabajoFrameRepository extends CrudRepository<TrabajoFrameModel,Long>{
    
}
