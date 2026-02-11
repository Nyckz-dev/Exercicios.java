package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.outsourcedEmployee;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
	
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();

		
		for (int i=1; i<=n; i++) {
			System.out.print("Employee #" + i + " data:");
			System.out.print("\nOutsourced (y/n)? ");
			char a = sc.next().charAt(0);
			sc.nextLine();			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			Double value = sc.nextDouble();
			
			if (a == 'y') {
			System.out.print("Additional charge: ");
			Double add = sc.nextDouble();
			outsourcedEmployee out = new outsourcedEmployee(name, hour, value, add);
			employees.add(out);
			}
			else {
				Employee employ = new Employee (name, hour, value);
				employees.add(employ);
			}	
		}
		
		System.out.println("\nPAYMENTS:");
		for (Employee employ : employees) {
			 System.out.println(employ.getName() + " - $" + String.format("%.2f", employ.payment()));
			}
		
		sc.close();
	}

}
