package com.curso.design.pattern.strategy;

public class TesteCalculoImposto {


	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(100);
		
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		
		calculadoraDeImposto.calcularImpostos(orcamento, CriadorDeImpostos.obterTipoImposto(EnumTipoImposto.ICMS));
		calculadoraDeImposto.calcularImpostos(orcamento, CriadorDeImpostos.obterTipoImposto(EnumTipoImposto.ICSS));
		
	}
	
}
