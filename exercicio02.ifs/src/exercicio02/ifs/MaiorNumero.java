package exercicio02.ifs;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com 3 numeros");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " é o maior");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " é o maior");
		} else if (n3 > n2 && n3 > n1) {
			System.out.println(n3 + " é o maior");
		} else {
			System.out.println("os numeros são iguais");
		}
		scan.close();
	}

}
