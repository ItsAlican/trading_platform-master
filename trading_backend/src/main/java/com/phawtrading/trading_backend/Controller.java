package com.phawtrading.trading_backend;  // Ensure this matches your folder structure

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/hello")

    //kein json
    //public String sayHello() {
        //return "Hello, PHAW!";
    //}

    //json format
    public ResponseEntity<Object> sayHello() {
        //JSON-Objekt als Antwort
        return ResponseEntity.ok().body("{\"message\": \"Hello, PHAW!\"}");
    }
}
