package br.com.Fundatec.Cafe.Cafe.api;

import br.com.Fundatec.Cafe.Cafe.api.Dto.EntragadorOutputDto;
import br.com.Fundatec.Cafe.Cafe.api.Dto.PedidoOutPutDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EntregadorApi {
    @PostMapping("/pedidos/{id}/entregadors")
    @ApiOperation(value = "Faz a inclusão de um carro no banco de dados",
            notes = "Valida se os campos obrigatório, valida se a data fabricação é no passado .. . voltaremos")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Pedido incluido com sucesso", response = PedidoOutPutDto.class),
    })
    public ResponseEntity<?> incluir(@RequestBody @Valid )


}
