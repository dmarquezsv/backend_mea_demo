/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mined.sistema.backend.model.User;

//Importación de paquetes
import jakarta.persistence.*; // Utilizado para mapear objetos Java a tablas de una base de datos relacional y realizar operaciones

/**
 *
 * @author usuario
 */
@Entity //Marca esta clase com una entidad JPA
@Table(name ="users") //Opcional si el nombre de la tabla coincide con el de la clase
public class User {
   
   @Id //Marca este campo como clave primaria
   @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incrementable
  
   private Long id;
   private String name;
   private String city;

    //Generación de Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
   

}
