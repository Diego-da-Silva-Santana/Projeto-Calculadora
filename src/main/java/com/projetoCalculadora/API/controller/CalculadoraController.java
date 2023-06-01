package com.projetoCalculadora.API.controller;

import com.projetoCalculadora.API.response.CalculadoraResponse;
import com.projetoCalculadora.API.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping(value = "/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }


    @GetMapping(value = "/soma/{num1}/{num2}")
    public ResponseEntity<Double> soma(@PathVariable Double num1, @PathVariable Double num2) {

        Double resultado = calculadoraService.soma(num1, num2);

        return ResponseEntity.ok(resultado);
    }

    @GetMapping(value = "/subtrair/{num1}/{num2}")
    public ResponseEntity<Double> subtrair(@PathVariable Double num1, @PathVariable Double num2) {

        Double resultado = calculadoraService.subtrair(num1, num2);

        return ResponseEntity.ok(resultado);

    }

    @GetMapping(value = "/divisao/{num1}/{num2}")
    public ResponseEntity<Double> divisao(@PathVariable Double num1, @PathVariable Double num2) {

        Double resultado = calculadoraService.divisao(num1, num2);

        return ResponseEntity.ok(resultado);

    }

    @GetMapping(value = "/multiplicacao/{num1}/{num2}")
    public ResponseEntity<Double> multiplicacao(@PathVariable Double num1, @PathVariable Double num2) {

        Double resultado = calculadoraService.multiplicacao(num1, num2);

        return ResponseEntity.ok(resultado);

    }

    @PostMapping("/soma")
    public ResponseEntity<CalculadoraResponse> soma( @Validated @RequestBody CalculadoraResponse calculadoraResponse ){

        Double resultado = calculadoraService.soma(calculadoraResponse.getNum1(),calculadoraResponse.getNum2());

        String descricao = "O resultado da soma de " + calculadoraResponse.getNum1() + " + " + calculadoraResponse.getNum2();

        CalculadoraResponse response = new CalculadoraResponse(calculadoraResponse.getNum1(), calculadoraResponse.getNum2(), resultado,descricao);
        return ResponseEntity.ok(response);
    }









}