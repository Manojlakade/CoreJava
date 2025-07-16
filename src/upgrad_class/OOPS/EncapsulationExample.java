package upgrad_class.OOPS;
class Bank{
    String name;
    private int balance;
    private String accountNumber;

    public Bank(String name, String accountNumber, int initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposite(int amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited amount :"+amount);
            System.out.println("Total balance after deposite :"+balance );

        }
    }
    public void withdraw(int amount){
        if (amount> balance){
            System.out.println("Insufficient balance for withdrawal");

        }else if(amount<balance){
            balance-=amount;
            System.out.println("Total balance after withdrawal :"+balance );
        }else{
            System.out.println("withdrawal amount must be zero");
        }
    }

    public int getBalance() {
        return balance;
    }
}


public class EncapsulationExample {
    public static void main(String[] args) {
        Bank bank = new Bank("manoj","123456789",100);
        bank.deposite(50);
        bank.withdraw(2);

    }

}
