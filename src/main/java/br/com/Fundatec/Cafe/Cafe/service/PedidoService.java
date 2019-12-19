package br.com.Fundatec.Cafe.Cafe.service;

import br.com.Fundatec.Cafe.Cafe.Model.Pedido;
import br.com.Fundatec.Cafe.Cafe.Repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }
    public List<Pedido> ListaProdutos(String produto){
       // return pedidoRepository.findByNomeContainingIgnoreCase(produto);
        return (List<Pedido>) pedidoRepository.findAll();

    }
    public Pedido consultar (Long id){
        return pedidoRepository.findById(id).orElse(null);
    }
    public Pedido incluir(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

}
