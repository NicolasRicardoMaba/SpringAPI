package br.com.projeto.api.control;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.Repo;

@RestController

public class Control { 
    @Autowired
    private Repo acao;  
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
