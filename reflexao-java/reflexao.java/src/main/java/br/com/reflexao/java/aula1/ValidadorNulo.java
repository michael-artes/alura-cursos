package br.com.reflexao.java.aula1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ValidadorNulo {
	
	public static List<String> validarValoresNulos(Object o) {
		List<String> list = new ArrayList<>();
		
		try {
			Class<?> classe = o.getClass();
			Field[] fields = classe.getFields();
			
			for (Field field : fields) {
				if (field.get(o) == null) {
					list.add(field.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	

}
