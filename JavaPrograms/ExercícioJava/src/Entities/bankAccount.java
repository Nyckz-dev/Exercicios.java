package Entities;

public class bankAccount {
    private int numberAccount;
    private String nameAccount;
    private double deposityValue;
    
    public bankAccount() {
        numberAccount = 0;
        nameAccount = " ";
        deposityValue = 0.0;
    }
    
    public void accountData(){
      System.out.printf("%nAccount data:%nAccount %d, holder: %s, balance: %.2f.%n%n", numberAccount, nameAccount, deposityValue);
    }
    
    public void UpAccountData(){
        System.out.printf("%nUpadeted Account data:%nAccount %d, holder: %s, balance: %.2f.%n%n", numberAccount, nameAccount, deposityValue);
      }
    
    public int getNumberAccount(int number) {
       return numberAccount = number;
    }
    
    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }
    
    public String getNameAccount(){
        return nameAccount;
    }
    
    public double getDeposityValue(double value) {
        return deposityValue -= (value + 5);
    }
    
    public void setDeposityValue(double deposity){
        deposityValue += deposity;
    }
    
    
    
    
}