package exercicio03.ifs;

import java.util.Scanner;

public class Exercicioifs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("entre com a nota do trabalho:");
		float n1 = scan.nextFloat();

		System.out.print("entre com a nota da avaliação:");
		float n2 = scan.nextFloat();

		System.out.print("entre com a nota do exame final:");
		float n3 = scan.nextFloat();

		float media = (n1 * 2 + n2 * 3 + n3 * 5) / (2 + 3 + 5);
		System.out.println("a media ponderada :" + media);

		if (media >= 8 && media <= 10) {
			System.out.println("Conceito A");
		}
		if (media >= 7 && media < 8) {
			System.out.println("Conceito B");
		}
		if (media >= 6 && media < 7) {
			System.out.println("Conceito C");
		}
		if (media >= 5 && media < 6) {
			System.out.println("Conceito D");
		}
		if (media >= 0 && media < 5) {
			System.out.println("Conceito E");
		}
		System.out.println("\n\nfim da analise");

		
		scan.close();
	}

}
