package encapsulation;

public class BankAccount {
    private double amount;
    private int withdraw;
    private long balance;

    public void deposit(double amount) {
        if(amount > 0) {
            balance+=amount;
            System.out.println("deposited" + amount);
        }else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount ) {
        if(amount > 0 && balance >=amount) {
            balance-=amount;
            System.out.println("amount has been whithdrawm");
        }else {
            System.out.println("invalid");
        }
    }
}
