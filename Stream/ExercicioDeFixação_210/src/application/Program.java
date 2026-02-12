package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file path: ");
		File path = new File(sc.nextLine());
		
		System.out.print("Enter salary: ");
		double avg = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			List<Employee> list = new ArrayList<>();
			
			while (line != null) {
				String[] lines = line.split(",");
				list.add(new Employee(lines[0], lines[1], Double.parseDouble(lines[2])));
				line = br.readLine();
			}
		 

			List<String> emails = list.stream()
					.filter(p -> p.getSalary() >= avg)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of the people whose salary is more than " + avg);
			emails.forEach(System.out::println);
			
			double avgSalary = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.mapToDouble(p -> p.getSalary())
					.sum();
					
		    System.out.println("Sum of salary of people whose name starts whith 'M': " + String.format("%.2f", avgSalary));
		}		
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
