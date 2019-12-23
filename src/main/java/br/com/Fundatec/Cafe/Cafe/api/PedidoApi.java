package br.com.Fundatec.Cafe.Cafe.api;

import br.com.Fundatec.Cafe.Cafe.Mapper.PedidoMapper;
import br.com.Fundatec.Cafe.Cafe.Model.Pedido;
import br.com.Fundatec.Cafe.Cafe.api.Dto.ErroDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.PedidoImputDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.PedidoOutPutDto;
import br.com.Fundatec.Cafe.Cafe.service.PedidoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PedidoApi {
    private final PedidoService pedidoService;
    private final PedidoMapper pedidoMapper;

    public PedidoApi(PedidoService pedidoService, PedidoMapper pedidoMapper) {
        this.pedidoService = pedidoService;
        this.pedidoMapper = pedidoMapper;
    }


    @PostMapping("/pedidos")
    @ApiOperation(value = "Faz a inclusão de um carro no banco de dados",
            notes = "Valida se os campos obrigatório, valida se a data fabricação é no passado .. . voltaremos")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Pedido incluido com sucesso", response = PedidoOutPutDto.class),
    })
    public ResponseEntity<?> incluir(@Valid @RequestBody PedidoImputDto pedidoImputDto) {
        Pedido pedido = pedidoMapper.mapear(pedidoImputDto);
        try {
            pedido = pedidoService.incluir(pedido);
            PedidoOutPutDto pedidoOutPutDto = pedidoMapper.mapear(pedido);
            return ResponseEntity.status(HttpStatus.CREATED).body(pedidoOutPutDto);
        } catch (RuntimeException e) {
            ErroDto erroDto = new ErroDto();
            erroDto.setMensagem(e.getMessage());
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(erroDto);

        }

    }

    @GetMapping("/pedidos")
    @ApiOperation(value = "Lista todos os pedidos do banco",
            notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Listado com sucesso", response = PedidoOutPutDto.class),
    })
    public ResponseEntity<List<PedidoOutPutDto>>ListaProdutos
            (@RequestParam(required = false, defaultValue = "") String nome) {
        List<Pedido> pedidos = pedidoService.ListaProdutos(nome);
        return getListResponseEntityPedidoOutputDto(pedidos);

    }

    private ResponseEntity<List<PedidoOutPutDto>> getListResponseEntityPedidoOutputDto(List<Pedido> pedidos) {
        if (pedidos.size() == 0){
            return ResponseEntity.noContent().build();

        }
        List<PedidoOutPutDto> pedidoOutPutDtos = pedidoMapper.mapear(pedidos);
        return ResponseEntity.ok(pedidoOutPutDtos);
    }
    @GetMapping("/peiddos/{id}")
    @ApiOperation(value = "Consulta pedido por id",
            notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "consulta realizada com sucesso", response = PedidoOutPutDto.class),
    })
    public ResponseEntity<PedidoOutPutDto> getPedido(@PathVariable Long id){
    Pedido pedido = pedidoService.consultar(id);
    if (pedido != null){
        PedidoOutPutDto pedidoOutPutDto = pedidoMapper.mapear(pedido);
        return ResponseEntity.ok(pedidoOutPutDto);
    }
    return ResponseEntity.noContent().build();

    }
    @DeleteMapping("/pedidos/{id}")
    @ApiOperation(value = "exclui o pedido por id ",
            notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "excluido com sucesso", response = PedidoOutPutDto.class),
    })
    public ResponseEntity<?> excluirPedido(@PathVariable Long id){
        pedidoService.excluir(id);
        return ResponseEntity.ok().build();
    }




}











