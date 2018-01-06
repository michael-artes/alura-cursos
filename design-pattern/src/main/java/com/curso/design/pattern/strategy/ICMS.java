package com.curso.design.pattern.strategy;

public class ICMS implements Imposto {

	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.6;
	}

	@Override
	public String toString() {
		return "ICMS é de 6%";
	}
	
}
