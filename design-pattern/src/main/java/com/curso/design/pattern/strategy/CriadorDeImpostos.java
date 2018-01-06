package com.curso.design.pattern.strategy;

public class CriadorDeImpostos {

	public static Imposto obterTipoImposto(EnumTipoImposto tipoImposto) {
		
		switch (tipoImposto) {

		case ICMS:
			return new ICMS();
			
		case ICSS:
			return new ICSS();

		}
		
		return null;
	}
	
}
