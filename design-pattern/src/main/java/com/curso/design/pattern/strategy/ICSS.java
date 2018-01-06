package com.curso.design.pattern.strategy;

public class ICSS implements Imposto {

	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.3;
	}

	@Override
	public String toString() {
		return "ICSS é de 3%";
	}

}
