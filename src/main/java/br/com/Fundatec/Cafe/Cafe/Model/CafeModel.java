package br.com.Fundatec.Cafe.Cafe.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CafeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNome;
    private String nome;
    private String endereco;
    private String produto;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    @OneToMany(mappedBy = "cafeModel")
    private Set<IntregadorModel> intregadorModelSet;


    public CafeModel() {
    }

    public CafeModel(Long idNome, String nome, String endereco, String produto, LocalDate dataPedido, LocalDate dataEntrega) {
        this.idNome = idNome;
        this.nome = nome;
        this.endereco = endereco;
        this.produto = produto;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Long getIdNome() {
        return idNome;
    }

    public void setIdNome(Long idNome) {
        this.idNome = idNome;
    }

    public Set<IntregadorModel> getIntregadorModelSet() {
        return intregadorModelSet;
    }

    public void setIntregadorModelSet(Set<IntregadorModel> intregadorModelSet) {
        this.intregadorModelSet = intregadorModelSet;
    }
}
