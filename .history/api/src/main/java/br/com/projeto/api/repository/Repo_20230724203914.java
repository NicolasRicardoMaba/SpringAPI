package br.com.projeto.api.repository;
 import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.projeto.api.model.Pessoa;

@Repository
public interface Repo  extends CrudRepository<Pessoa, Integer>{
    
    List<Pessoa> findAll();
    Pessoa findByCodigo(int codigo);
    List<Pessoa> findByOrderByName();
    List<Pessoa> findByNameOrderByAgeDesc(String name);
    List<Pessoa> findByNameContaining(String term);
    List<Pessoa> findByNameStartsWith(String term);
    List<Pessoa> findByNameEndsWith(String term);
@Query(value = "select sum(age)from pessoas",nativeQuery = true)
    int sumAge();
}
