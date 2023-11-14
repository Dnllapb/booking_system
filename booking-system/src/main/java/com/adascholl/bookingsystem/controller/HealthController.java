package com.adascholl.bookingsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController class HealthController { // anotacion que le indica a spring que la clase es un controlador y que sus metodos deben
// devolver datos que se deben escribir directamente en la respuesta http
      @RequestMapping("/health")
      @GetMapping
      public String checkAPI(){
       return "<h1>The API is working ok!</h1>";
   }
}
