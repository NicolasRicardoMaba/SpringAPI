package br.com.projeto.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.model.Pessoa;

@Repository
public interface Repo  extends CrudRepository<Pessoa, Integer>{


    






}
