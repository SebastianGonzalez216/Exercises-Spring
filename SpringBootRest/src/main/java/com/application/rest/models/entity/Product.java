package com.application.rest.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

//anotaciones de Lombok
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

//anotaciones de JPA
@Entity
@Table(name = "producto")

public class Product {

    @Id //indica que el atributo es PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) //establece que JPA generara dicho valor de manera unica
    private Long id;
    @Column(name = "nombre") //permite asignar un nombre a la columna del atributo en base de datos
    private String name;
    @Column(name = "precio")
    private BigDecimal price; //El tipo de dato BigDecimal es mas preciso, recomendado para el manejo de dinero

    @ManyToOne //indica que la relacion de esta entidad con productos es de MUCHOS A UNO
    @JoinColumn(name = "id_fabricante", nullable = false)
    @JsonIgnore
    private Maker maker;

}
