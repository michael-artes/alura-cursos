package br.com.reflexao.java.aula2;

import java.util.List;
import java.util.Map;

public class Principal {
	public static void main(String[] args) throws Exception {

		Mapeador m = new Mapeador();
		m.load("src/main/resources/classes.prop");

		System.out.println(m.getImplementacao(List.class));
		System.out.println(m.getImplementacao(Map.class));
	}
}