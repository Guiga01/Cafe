package br.com.Fundatec.Cafe.Cafe.Repository;

import br.com.Fundatec.Cafe.Cafe.Model.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

    List<Pedido> findByNomeContainingIgnoreCase(String nome);




}
