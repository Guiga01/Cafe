package br.com.Fundatec.Cafe.Cafe.api.Dto;

import br.com.Fundatec.Cafe.Cafe.enums.SituacaoPedidoEnum;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class PedidoImputDto {
    private String endereco;
    private String Produto;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    @NotBlank(message = "campo obrigatório")
    private SituacaoPedidoEnum situacao;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public SituacaoPedidoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPedidoEnum situacao) {
        this.situacao = situacao;
    }
}
