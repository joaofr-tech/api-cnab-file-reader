package com.importacao.cnab.model;

import java.util.Arrays;

public enum TipoTransacao {
    DEBITO(1, "Débito", "Entrada", "+"),
    BOLETO(2, "Boleto", "Saída", "-"),
    FINANCIAMENTO(3, "Financiamento", "Saída", "-"),
    CREDITO(4, "Crédito", "Entrada", "+"),
    RECEBIMENTO_EMPRESTIMO(5, "Recebimento Empréstimo", "Entrada", "+"),
    VENDAS(6, "Vendas", "Entrada", "+"),
    RECEBIMENTO_TED(7, "Recebimento TED", "Entrada", "+"),
    RECEBIMENTO_DOC(8, "Recebimento DOC", "Entrada", "+"),
    ALUGUEL(9, "Aluguel", "Saída", "-");

    private final int codigo;
    private final String descricao;
    private final String natureza;
    private final String sinal;

    TipoTransacao(int codigo, String descricao, String natureza, String sinal) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.natureza = natureza;
        this.sinal = sinal;
    }

    public static TipoTransacao fromCodigo(int codigo){
        return Arrays.stream(TipoTransacao.values())
                .filter(tipo -> tipo.codigo == codigo)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Transacao Invalida"));
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNatureza() {
        return natureza;
    }

    public String getSinal() {
        return sinal;
    }
}
