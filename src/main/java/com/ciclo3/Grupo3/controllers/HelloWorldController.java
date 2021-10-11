
package com.ciclo3.Grupo3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author raque
 */
@RestController
@RequestMapping("/sayhello")
public class HelloWorldController {
    
    @GetMapping("/sayhello")
    public String SayHello(){
        return "<h1>Hello World!</h1>";
    }
}
