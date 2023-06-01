package com.projetoCalculadora.API.service.serviceImpl;

import com.projetoCalculadora.API.service.CalculadoraService;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {
    @Override
    public Double soma(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    public Double divisao(Double num1, Double num2) {
        return num1 / num2;
    }

    @Override
    public Double subtrair(Double num1, Double num2) {
        return num1 - num2;
    }

    @Override
    public Double multiplicacao(Double num1, Double num2) {
        return num1 * num2;
    }
}
