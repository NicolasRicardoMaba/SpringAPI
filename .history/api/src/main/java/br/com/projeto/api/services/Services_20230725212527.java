package br.com.projeto.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Message;
import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.Repo;

@Service
public class Services {
    @Autowired
    private Message message;
    @Autowired
    private Repo acao;


public ResponseEntity<?> cadastrar(Pessoa obj){
    if (obj.getName().equals("")){
        message.setMessage("O nome precisa ser preenchido!");
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }else if(obj.getAge()< 0){
        message.setMessage("Informe uma idade valida!");
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
        else{
            
            return  new ResponseEntity<>(acao.save(obj), HttpStatus.CREATED);
        }
    } 
    public ResponseEntity<?> selecionar(){
        return new ResponseEntity<> (acao.findAll(), HttpStatus.OK);

    }
       public ResponseEntity<?> selectByCodigo(int codigo){
            
            if (acao.countBycodigo(codigo) == 0){
            message.setMessage("Não foi encontrada nenhuma pessoa");
            return new ResponseEntity<>( message, HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<>(acao.findByCodigo(codigo), HttpStatus.OK);
        }
    }
  
    public ResponseEntity<?> alterar(Pessoa obj){
        if (obj.getAge()<0){    
            message.setMessage("Idade invalida!");
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
     if (obj.getName().equals("")){
        message.setMessage("Nome invalido!");
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);


    }
    else{
        message.setMessage("Alterado!");
        return new ResponseEntity<>(message, HttpStatus.ACCEPTED);

    }
    }


}





