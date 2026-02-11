package Application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> pro = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n  = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char a = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (a == 'i') {
				System.out.print("Custom fee: ");
				Double custom = sc.nextDouble();
				ImportedProduct imported = new ImportedProduct(name,price, custom);
				pro.add(imported);			
				}

			if (a == 'c') {
				Product product = new Product(name, price);
				pro.add(product);
			}
			
			if (a == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate frt = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				sc.nextLine();
				
				
				UsedProduct used = new UsedProduct(name, price, frt);
				pro.add(used);

		    }
		}    
		
		System.out.println("\nPRICE TAGS:");
		for(Product p1 : pro) {
			System.out.println(p1.priceTag() + "\n");
		}
	}

}
