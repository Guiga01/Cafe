package br.com.Fundatec.Cafe.Cafe.Mapper;

import br.com.Fundatec.Cafe.Cafe.Model.Entregador;
import br.com.Fundatec.Cafe.Cafe.api.Dto.EntragadorOutputDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.EntregadorImputDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.PedidoOutPutDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EntregadorMapper {
    public EntragadorOutputDto mapear (Entregador entregador){
        EntragadorOutputDto  entragadorOutputDto= new EntragadorOutputDto();
        entragadorOutputDto.setId(entregador.getId());
        entragadorOutputDto.setNome(entregador.getNome());
        return entragadorOutputDto;
    }
    public List<EntragadorOutputDto> mapear(List<Entregador> entregadors){
        List<EntragadorOutputDto> entragadorOutputDtos = new ArrayList<>();
        for (Entregador entregador : entregadors){
            entragadorOutputDtos.add(mapear((entregador)));
        }
        return entragadorOutputDtos;
    }
    public Entregador mapear(EntregadorImputDto entregadorImputDto){
        Entregador entregador = new Entregador();
        entregador.setNome(entregadorImputDto.getNome());
        return entregador;
    }
 }
