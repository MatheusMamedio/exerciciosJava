package com.cursoloiane.matheus.aulas;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 1;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		// concatenação:

		String primeiraString = "esta é";
		String segundaString = " uma String concatenada";
		String terceiraString = primeiraString + segundaString;
		System.out.println(terceiraString);
		
		//incremento
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);
		// mesma coisa que:
		// System.out.println(resultado);
		// resultado = resultado + 1;
		// resultado += 1;
		System.out.println(++resultado);
		// mesma coisa que:
		// resultado += 1;
		// System.out.println(resultado);

		resultado--;
		System.out.println(resultado);

		System.out.println(resultado--);
		System.out.println(--resultado);

	}

}
