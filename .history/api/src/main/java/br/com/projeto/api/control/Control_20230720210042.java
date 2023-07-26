package br.com.projeto.api.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Pessoa;

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


    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
return p;
    }





}
