package br.com.Fundatec.Cafe.Cafe.service;

import br.com.Fundatec.Cafe.Cafe.Model.Entregador;
import br.com.Fundatec.Cafe.Cafe.Repository.EntregadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregadorService {

    private final EntregadorRepository entregadorRepository;

    public EntregadorService(EntregadorRepository entregadorRepository) {
        this.entregadorRepository = entregadorRepository;
    }

    public List<Entregador> ListaEntregadores(String nome){
        return entregadorRepository.findByNomeContainingIgnoreCase(nome);
    }
    public Entregador incluir(Entregador entregador){
        return entregadorRepository.save(entregador);

    }
}
