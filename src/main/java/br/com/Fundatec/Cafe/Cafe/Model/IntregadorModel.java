package br.com.Fundatec.Cafe.Cafe.Model;

import javax.persistence.*;

@Entity
public class IntregadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intregador;
    @ManyToOne
    @JoinColumn(name = "id_cafe")
    private CafeModel cafeModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntregador() {
        return intregador;
    }

    public void setIntregador(String intregador) {
        this.intregador = intregador;
    }

    public CafeModel getCafeModel() {
        return cafeModel;
    }

    public void setCafeModel(CafeModel cafeModel) {
        this.cafeModel = cafeModel;
    }
}
