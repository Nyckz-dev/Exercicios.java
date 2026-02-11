package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


public class application {



	public static void main(String[] args) throws ParseException {
 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy)");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		int N = sc.nextInt();
		for ( int i = 0; i < N; i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.println("QUantity: ");
			Integer quantity = sc.nextInt();	
			
			Product product = new Product(productName, productPrice);	
		    OrderItem it = new OrderItem(quantity, productPrice, product);	
		}
	
         
		
		
		
        sc.close();
        }
	}


