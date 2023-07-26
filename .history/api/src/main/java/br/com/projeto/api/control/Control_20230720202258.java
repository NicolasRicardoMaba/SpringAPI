package br.com.projeto.api.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Control {
    @GetMapping("")
    public String message () {

        return "A";
    }   
    @GetMapping ("/text/{name}") 
    public  String rout2 (@PathVariable String name){
        return ("Variavel chamada pela rota : " + name);
    }






}
