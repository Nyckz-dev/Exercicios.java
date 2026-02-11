package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int AccountNumber = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy) : ");
		LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
	
		Contract contract = new Contract(AccountNumber, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int months = sc.nextInt();
	
		ContractService service = new ContractService(new PaypalService());
		
	    service.processContract(contract, months);
		
		
		System.out.println("PARCELAS:");
		for (Installment installment : contract.getList()) {
			System.out.println(installment);
		}
		
		

		sc.close();
	}

}
