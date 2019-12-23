package br.com.Fundatec.Cafe.Cafe.api;

import br.com.Fundatec.Cafe.Cafe.Mapper.EntregadorMapper;
import br.com.Fundatec.Cafe.Cafe.Model.Entregador;
import br.com.Fundatec.Cafe.Cafe.api.Dto.EntragadorOutputDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.EntregadorImputDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.PedidoOutPutDto;
import br.com.Fundatec.Cafe.Cafe.service.EntregadorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EntregadorApi {
    private final EntregadorService entregadorService;
    private final EntregadorMapper entregadorMapper;

    public EntregadorApi(EntregadorService entregadorService, EntregadorMapper entregadorMapper) {
        this.entregadorService = entregadorService;
        this.entregadorMapper = entregadorMapper;
    }


    @PostMapping("/pedidos/{id}/entregadors")
    @ApiOperation(value = "Faz a inclusão de um entregador",
            notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Entregador incluido com sucesso", response = EntragadorOutputDto.class),
    })
    public ResponseEntity<?> incluir(@RequestBody @Valid EntregadorImputDto entregadorImputDto, @PathVariable(value = "id") Long idPedido){
        Entregador entregador = entregadorMapper.mapear(entregadorImputDto);
        entregador = entregadorService.incluir(entregador,idPedido);
        EntragadorOutputDto entragadorOutputDto = entregadorMapper.mapear(entregador);
        return ResponseEntity.ok(entragadorOutputDto);

    }


}
