package Apply;

import java.util.Scanner;
import entities.Animal;
public class Main {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 Animal gen = new Animal();
	 
	 System.out.println("Qual é a espécie?");
	 String especie = sc.nextLine(); 
	 
     gen.exibirAnimal()= especie;
	}

}