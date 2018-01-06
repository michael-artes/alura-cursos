package com.curso.design.pattern.strategy;

public class CalculadoraDeImposto {

	public void calcularImpostos(Orcamento orcamento, Imposto imposto) {
		double valor = imposto.calcular(orcamento);
		System.out.println("Valor do imposto: " + imposto.toString() + " -> " + valor);
	}
	
}
