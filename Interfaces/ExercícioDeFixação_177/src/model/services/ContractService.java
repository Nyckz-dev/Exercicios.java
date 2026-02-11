package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService online;
	
	public ContractService(OnlinePaymentService online) {
		this.online = online;
	}
	
	public void processContract(Contract contract, Integer months) {
	  Double parcela = contract.getTotalValue() / months;
	  for (int i = 0; i < months ; i++) {
	  LocalDate dueDate = contract.getDate().plusMonths(i);
	  Double interest = online.interest(parcela, i + 1);
	  Double fee = online.paymentFee(parcela + interest);
	  Double som = parcela + interest + fee;
	  contract.getList().add(new Installment(dueDate, som));
	  
	}

	}
}
