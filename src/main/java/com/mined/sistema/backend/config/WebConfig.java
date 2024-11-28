/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mined.sistema.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author usuario
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
@Override
public void addCorsMappings(CorsRegistry registry) {
   registry.addMapping("/**") // Permite CORS en todas las rutas
           .allowedOrigins("*") // Permite solicitudes desde cualquier origen
           .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
           .allowedHeaders("*"); // Permite todos los encabezados
}

}
