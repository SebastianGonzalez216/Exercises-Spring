package com.application.rest.repository;

import com.application.rest.models.entity.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends CrudRepository<Maker,Long> { //Deben especificarse como parametros la clase ala que eprtenece el repositorio y el tipo de dato del ID del modelo
}
