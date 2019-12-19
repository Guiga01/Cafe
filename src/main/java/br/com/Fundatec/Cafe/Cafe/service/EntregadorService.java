package br.com.Fundatec.Cafe.Cafe.service;

import br.com.Fundatec.Cafe.Cafe.Model.Entregador;
import br.com.Fundatec.Cafe.Cafe.Model.Pedido;
import br.com.Fundatec.Cafe.Cafe.Repository.EntregadorRepository;
import org.springframework.stereotype.Service;

@Service
public class EntregadorService {

    private final EntregadorRepository entregadorRepository;
    private final PedidoService pedidoService;


    public EntregadorService(EntregadorRepository entregadorRepository, PedidoService pedidoService) {
        this.entregadorRepository = entregadorRepository;
        this.pedidoService = pedidoService;
    }

    public Entregador incluir(Entregador entregador,Long idPedido){
        Pedido pedido = pedidoService.consultar(idPedido);
        entregador.setPedido(pedido);
        return entregadorRepository.save(entregador);

    }
}
