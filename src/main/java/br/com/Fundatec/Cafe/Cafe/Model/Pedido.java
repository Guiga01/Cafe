package br.com.Fundatec.Cafe.Cafe.Model;

import br.com.Fundatec.Cafe.Cafe.enums.SituacaoPedidoEnum;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String endereco;
    private String produto;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    @Enumerated(EnumType.STRING)
    private SituacaoPedidoEnum situacao;
    @ManyToOne
    @JoinColumn(name = "id_entregador")
    private Entregador entregador;


    public Pedido() {
    }

    public Pedido(String endereco, String produto, LocalDate dataPedido, LocalDate dataEntrega) {
        this.endereco = endereco;
        this.produto = produto;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
    }


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

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
}
