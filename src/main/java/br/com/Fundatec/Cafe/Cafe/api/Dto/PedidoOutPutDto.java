package br.com.Fundatec.Cafe.Cafe.api.Dto;

import br.com.Fundatec.Cafe.Cafe.enums.SituacaoPedidoEnum;

import java.time.LocalDate;

public class PedidoOutPutDto {
    private Long id;
    private String endereco;
    private String produto;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    private SituacaoPedidoEnum situacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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
