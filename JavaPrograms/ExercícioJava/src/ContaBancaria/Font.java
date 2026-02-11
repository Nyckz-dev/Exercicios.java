package ContaBancaria ;

import java.util.Scanner;
import Entities.bankAccount;

public class Font {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankAccount bank = new bankAccount();
        
        System.out.println("Enter number account: ");
        int number = sc.nextInt();
        bank.getNumberAccount(number);
        sc.nextLine();
        
        System.out.println("Enter account holder: ");
        String nameAccount = sc.nextLine();
        bank.setNameAccount(nameAccount);
        
        
        System.out.println("Is there an initial deposit (s/n)? ");
        char ansewer = sc.nextLine().charAt(0);
        if (ansewer == 's') {
            System.out.println("Enter initial deposit: ");
            double deposity = sc.nextDouble();
            bank.setDeposityValue(deposity);
            bank.accountData();
        }
        else {
        bank.accountData();
        
        }
        
        System.out.println("Enter a deposit value: ");
        double deposity = sc.nextDouble();
        bank.setDeposityValue(deposity); 
        
        bank.UpAccountData();
        
        System.out.println("Enter a withdraw value: ");
        double value = sc.nextDouble();
        bank.getDeposityValue(value);
        
        bank.UpAccountData();
    }
    
}