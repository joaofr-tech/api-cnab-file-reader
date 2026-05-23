package com.importacao.cnab.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String natureza;
    private String sinal;
    private LocalDate data;
    private BigDecimal valor;
    private String cpf;
    private String cartao;
    private LocalTime hora;
    private String donoLoja;
    private String nomeLoja;


    public Transacao() {
    }
    

    public Transacao(Long id, String tipo, String natureza, String sinal, LocalDate data, BigDecimal valor, String cpf, String cartao, LocalTime hora, String donoLoja, String nomeLoja) {
        this.id = id;
        this.tipo = tipo;
        this.natureza = natureza;
        this.sinal = sinal;
        this.data = data;
        this.valor = valor;
        this.cpf = cpf;
        this.cartao = cartao;
        this.hora = hora;
        this.donoLoja = donoLoja;
        this.nomeLoja = nomeLoja;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNatureza() {
        return this.natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getSinal() {
        return this.sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCartao() {
        return this.cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDonoLoja() {
        return this.donoLoja;
    }

    public void setDonoLoja(String donoLoja) {
        this.donoLoja = donoLoja;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

}
