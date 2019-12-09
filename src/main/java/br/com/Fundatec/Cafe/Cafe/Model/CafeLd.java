package br.com.Fundatec.Cafe.Cafe.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;
@EntityScan
public class CafeLd {
    private String nome;
    private String intregador;
    private String endereco;
    private String produto;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIntregador() {
        return intregador;
    }

    public void setIntregador(String intregador) {
        this.intregador = intregador;
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
}