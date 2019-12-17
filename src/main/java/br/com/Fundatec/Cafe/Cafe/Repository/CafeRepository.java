package br.com.Fundatec.Cafe.Cafe.Repository;

import br.com.Fundatec.Cafe.Cafe.Model.CafeModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CafeRepository extends CrudRepository<CafeModel, Long> {

    List<CafeModel> findByNomeContainingIgnoreCase(String nome);



}
