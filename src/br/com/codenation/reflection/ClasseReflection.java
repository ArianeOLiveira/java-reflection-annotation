package br.com.codenation.reflection;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class ClasseReflection {

	public BigDecimal somar(Class object) {
		BigDecimal result = new BigDecimal(0);
		try {
			Object testClass = object.newInstance();
			Class c = Class.forName(object.getName());
			for (Field atributo : c.getDeclaredFields()) {
				atributo.setAccessible(true);
				if (atributo.isAnnotationPresent(Soma.class) && atributo.getType().equals(BigDecimal.class)) {
					result = result.add((BigDecimal) atributo.get(testClass));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public BigDecimal somarObject(Object object) {
		BigDecimal result = new BigDecimal(0);
		try {
			for (Field atributo : object.getClass().getDeclaredFields()) {
				atributo.setAccessible(true);
				if (atributo.isAnnotationPresent(Soma.class) && atributo.getType().equals(BigDecimal.class)) {
					result = result.add((BigDecimal) atributo.get(object));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
