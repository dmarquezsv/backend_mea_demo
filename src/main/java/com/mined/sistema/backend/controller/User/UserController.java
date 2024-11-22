/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mined.sistema.backend.controller.User;

//Importación de paquetes de Java
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

//Importación de paquete
import com.mined.sistema.backend.service.User.UserService;
import com.mined.sistema.backend.model.User.User;

/**
 *
 * @author usuario
 */
// Marca esta clase como un controlador REST (Maneja Solicitudes HTTP y devuelve respuesta Json)
@RestController
//Difine la ruta base para todas las solicitudes relacionada con usuarios
@RequestMapping("api/v1/user")
public class UserController {
    
    //Inyección de dependencias
    //El Servicio será proporcionado automáticamente por Srping
    private final UserService userService;
    
   //Constructor para inicializar el servicio con el repositorio
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    //Endpoint para buscar un usuario por ID
    @GetMapping("/{id}")
    public ResponseEntity<User>getUserById(@PathVariable Long id){
        
        Optional<User> user = userService.getUserById(id);
        
        if(user.isPresent()){
            return ResponseEntity.ok(user.get()); //Retorna 200 Ok con el usuario encotrado
        }else{
         return ResponseEntity.notFound().build(); //Retorna 404 not found si no existe
        }
    }
}
