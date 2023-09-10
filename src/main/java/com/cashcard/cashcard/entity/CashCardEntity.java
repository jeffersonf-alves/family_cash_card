package com.cashcard.cashcard.entity;

import java.util.Date;

public class CashCardEntity {
    private String nome;
    private double valor;
    private Date dataRecebimento;
    private String status;

    public CashCardEntity(String nome, double valor, Date dataRecebimento, String status) {
        this.nome = nome;
        this.valor = valor;
        this.dataRecebimento = dataRecebimento;
        this.status = status;
    }
}
