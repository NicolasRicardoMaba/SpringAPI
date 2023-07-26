package br.com.projeto.api.control;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.Repo;

@RestController
public class Control { 



    @Autowired
    private Repo acao; 
    
    @GetMapping("/api")
    public List<Pessoa> selecionar(){
        return acao.findAll();
    }
    @GetMapping("/api/{codigo}")
    public Pessoa SelecionarPorCodigo(@PathVariable int codigo){
        return acao.findByCodigo(codigo);    
    }
    

    @PostMapping("/api") 
    public Pessoa cadastrar(@RequestBody Pessoa obj){
return acao.save(obj);
    }

    @PutMapping("/api")
    public Pessoa alterar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }
    @DeleteMapping("/api/{codigo}")
    public void Delete(@PathVariable int codigo){
       Pessoa obj = acao.findByCodigo(codigo);
         acao.delete(obj);
    }


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
