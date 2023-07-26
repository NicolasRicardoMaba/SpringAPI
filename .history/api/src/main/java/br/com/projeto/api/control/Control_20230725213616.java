package br.com.projeto.api.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.Repo;
import br.com.projeto.api.services.Services;

@RestController
public class Control { 



    @Autowired
    private Repo acao; 
    @Autowired
    private Services service;
    @GetMapping("/api")
    public ResponseEntity<?> select(){
        return service.selecionar();
    }
     @GetMapping("/api/{codigo}")
    public ResponseEntity<?> selectByCodigo(@PathVariable int codigo){
        return service.selectByCodigo(codigo);    
    }
    

    @PostMapping("/api") 
    public ResponseEntity<?> cadastrar (@RequestBody Pessoa obj){
    return service.cadastrar(obj);
    }
///////
    @PutMapping("/api")
    public ResponseEntity<?> alterar(@RequestBody Pessoa obj){
        return service.alterar(obj);
    }
    @DeleteMapping("/api/{codigo}")
    public void Delete(@PathVariable int codigo){
       Pessoa obj = acao.findByCodigo(codigo);
         acao.delete(obj);
    }
    @GetMapping("/api/contador")
    public long contador(){
        return acao.count();
    }
    @GetMapping("/api/Ordenador")
    public List<Pessoa> ordenar(){
        return acao.findByOrderByName();
    }
    @GetMapping("/api/acharPorNomeOrdenarPorIdade")
    public List<Pessoa> acharPorNomeOrdenarPorIdade(){
        return acao.findByNameOrderByAgeDesc("Tatiana");
    }
    @GetMapping("/api/contendo")
        public List<Pessoa> ListarPorTermos(){
        return acao.findByNameContaining("N");
    }

    @GetMapping("/api/comecaCom")
    public List<Pessoa> comecandoCom(){
        return acao.findByNameStartsWith("N");
    }

    @GetMapping("/api/terminandoCom")
    public List<Pessoa> terminandoCom(){
        return acao.findByNameEndsWith("a");
    }
    @GetMapping("/api/sumAge")
    public int sumAge(){
        return acao.sumAge();
    } 
    @GetMapping("/api/idadeMaiorIgual")
    public List<Pessoa> idadeMaiorIgual(){
        return acao.idadeMaiorIgual(18);
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
@GetMapping("/status")
 public ResponseEntity<?> status (){
    return new ResponseEntity<>(HttpStatus.CREATED);

 }



}
