package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scan.next();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quanntity in stock: ");
		product.quantity = scan.nextInt();
		
		System.out.println(product);
		
		scan.close();
		
	}

}
