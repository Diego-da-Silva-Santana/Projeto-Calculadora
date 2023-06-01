package com.projetoCalculadora.API.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;


public class CalculadoraResponse {

    @NonNull
    @JsonProperty(value = "num1")
    private Double num1;
    @NonNull
    @JsonProperty(value = "num2")
    private Double num2;
    @JsonProperty(value = "resultado")
    private Double resultado;
    @JsonProperty(value = "descricao")
    private String descricao;

    public CalculadoraResponse() {
    }

    public CalculadoraResponse(Double num1, Double num2, Double resultado, String descricao) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
        this.descricao = descricao;
    }

    public Double getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }

    public Double getResultado() {
        return resultado;
    }

    public String getDescricao() {
        return descricao;
    }
}
