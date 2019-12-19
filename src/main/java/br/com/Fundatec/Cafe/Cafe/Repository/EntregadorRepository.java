package br.com.Fundatec.Cafe.Cafe.Repository;

import br.com.Fundatec.Cafe.Cafe.Model.Entregador;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntregadorRepository extends CrudRepository<Entregador, Long> {

    List<Entregador> findByNomeContainingIgnoreCase(String nome);
}
