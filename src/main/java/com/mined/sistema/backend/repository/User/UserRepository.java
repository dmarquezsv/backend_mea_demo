/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mined.sistema.backend.repository.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mined.sistema.backend.model.User.User;

/**
 *
 * @author usuario
 */

public interface UserRepository extends JpaRepository<User,Long>{
    
 //No se necesita código adicional para la búsqueda por ID
 // En este apartado para realizar consultas complejas
}
