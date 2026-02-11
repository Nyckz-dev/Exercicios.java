package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char a = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double Anual = sc.nextDouble();
			
			if (a == 'i') {
			System.out.print("Health expenditures: ");
			Double health = sc.nextDouble();
			list.add(new Individual(name, Anual, health));	
	  }
			if (a == 'c') {
				System.out.print("Number of employees: ");
				int emp = sc.nextInt();
				list.add(new Company(name, Anual, emp));
			}
    }
		Double sum = 0.0;
		System.out.println("\nTAXES PAID:");
		for (TaxPayer payer : list) {
			System.out.println(payer.getName() + ": $" + String.format("%.2f", payer.tax()));
			sum +=  payer.tax();
		}
		
		System.out.print("TOTAL TAXES: ");
		System.out.print("$ " + sum);
	
		sc.close();
	}

}
