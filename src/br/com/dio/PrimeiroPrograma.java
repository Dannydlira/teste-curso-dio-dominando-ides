package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros(); /* essa classe não precisa importar, está dentro do mesmo arquivo */

		System.out.println(gato);
		System.out.println(livros);

		/*
		 * int a = 2; int b = 3; System.out.println("Hello world! " + (a+b));
		 */

	}

}

class Livros {
	private String nome;
	private String npag;
}
