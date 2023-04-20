package one.digitalinnovation.labpadroesprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//interface que prove todos os metodos de acesso a dados. CrudRepository é uma strategy

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
