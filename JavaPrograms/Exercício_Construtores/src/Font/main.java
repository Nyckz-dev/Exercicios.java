package Font;
import java.util.Scanner;

import entities.Pessoa;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoal = new Pessoa("Nycolas");
		System.out.print(pessoal.saudar());
        sc.close();
	}

}
