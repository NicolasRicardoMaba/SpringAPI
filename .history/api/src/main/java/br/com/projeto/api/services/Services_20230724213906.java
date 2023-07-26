package br.com.projeto.api.services;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
    }
  
}


}
