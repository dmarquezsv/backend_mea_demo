/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mined.sistema.backend.service.User;

//Importación de paquetes
import com.mined.sistema.backend.repository.User.UserRepository;
import com.mined.sistema.backend.model.User.User;
import java.util.List;

//Importación de Java
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 *
 * @author usuario
 */
@Service
public class UserService {
  
    //Intección de depencias: El Repositorio será proporcionado
    //automáticamente por Spring
    private final UserRepository userRepository;
    
    //Constructor para inicializar el servicio con el repositorio
    public UserService(UserRepository userRepository){
     this.userRepository = userRepository;
    }
    
    //Obtener todos los usuarios
    public List<User> getAllUsers(){
    return userRepository.findAll();
    }
    
    //Buscar un usuario por ID
    public Optional<User> getUserById(Long id){
     return userRepository.findById(id);
    }
}
