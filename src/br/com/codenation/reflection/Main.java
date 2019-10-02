package br.com.codenation.reflection;

public class Main {

	public static void main(String args[]) {
		ClasseReflection classe = new ClasseReflection();
		classe.somar(ClasseTeste.class);
		
		ClasseTeste teste = new ClasseTeste();
		classe.somarObject(teste);
	}

}
