package br.com.Fundatec.Cafe.Cafe.Mapper;

import br.com.Fundatec.Cafe.Cafe.Model.Pedido;
import br.com.Fundatec.Cafe.Cafe.api.Dto.PedidoImputDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.PedidoOutPutDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PedidoMapper {
    public PedidoOutPutDto mapear(Pedido pedido){
        PedidoOutPutDto pedidoOutPutDto = new PedidoOutPutDto();
        pedidoOutPutDto.setDataEntrega(pedido.getDataEntrega());
        pedidoOutPutDto.setDataPedido(pedido.getDataPedido());
        pedidoOutPutDto.setEndereco(pedido.getEndereco());
        pedidoOutPutDto.setProduto(pedido.getProduto());
        pedidoOutPutDto.setId(pedido.getId());
        pedidoOutPutDto.setSituacao(pedido.getSituacao());
        return pedidoOutPutDto;
    }
    public List<PedidoOutPutDto> mapear(List<Pedido> pedidos){
        List<PedidoOutPutDto> pedidoOutPutDtos = new ArrayList<>();
        for(Pedido pedido : pedidos){
            pedidoOutPutDtos.add(mapear(pedido));
        }
        return pedidoOutPutDtos;
    }
    public Pedido mapear(PedidoImputDto pedidoImputDto){
        Pedido pedido = new Pedido();
        pedido.setDataEntrega(pedidoImputDto.getDataEntrega());
        pedido.setDataPedido(pedidoImputDto.getDataPedido());
        pedido.setEndereco(pedidoImputDto.getEndereco());
        pedido.setProduto(pedidoImputDto.getProduto());
        pedido.setSituacao(pedidoImputDto.getSituacao());
        return pedido;
    }
}
