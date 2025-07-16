package com.bomfrio.model;
import java.time.LocalDate; 

public class Servico {
    private int id;
    private String cpf;
    private String tipoServico;
    private String nomeServico;
    private String descServico;
    private String observacao;
    private double valor;
    private LocalDate dataServico;
    private String status;

    public Servico(int id, String cpf, String tipoServico, String nomeServico, String descServico, String observacao, double valor, LocalDate dataServico, String status) {
        this.id = id;
        this.cpf = cpf;
        this.tipoServico = tipoServico;
        this.nomeServico = nomeServico;
        this.descServico = descServico;
        this.observacao = observacao;
        this.valor = valor;
        this.dataServico = dataServico;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescServico() {
        return descServico;
    }

    public void setDescServico(String descServico) {
        this.descServico = descServico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataServico() {
        return dataServico;
    }

    public void setDataServico(LocalDate dataServico) {
        this.dataServico = dataServico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
