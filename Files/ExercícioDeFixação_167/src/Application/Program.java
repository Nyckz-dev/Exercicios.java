package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			List<Product> list = new ArrayList<>();
			
			System.out.print("Enter file path: ");
			String Filepath = sc.nextLine();
			
			File file = new File(Filepath);
			String folderPath = file.getParent();
			
			boolean folder = new File(folderPath + "/Out").mkdir();
			
			System.out.print("Folder created: " + folder);
			String outfile = folderPath + "/Out/summary.csv";
			
		try (BufferedReader br = new BufferedReader(new FileReader(Filepath))) {
			   String line = br.readLine(); 
	
			   while (line != null) {
				  line = br.readLine();
				  String[] linhas = line.split(",");
				  Double value = Double.parseDouble(linhas[1]) * Integer.parseInt(linhas[2]) ;  
				  Product pro = new Product(linhas[0], value);
				  list.add(pro);
			   }
			   
			   try(BufferedWriter bw = new BufferedWriter(new FileWriter(outfile))) {
				
				   for (Product pro : list) {
					   bw.write(pro.getName() + "," + String.format(".2f", pro.getValue()));
					   bw.newLine();
				   }
				   
				   System.out.println("File created.");
					
			   }
  
			   catch (IOException e) {
				   e.printStackTrace();
			   }
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
}
		
	