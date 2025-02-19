package constructors;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    // Parameterized Constructors
    public BankAccount(int acNum, double bal, String accHN) {
        this.accountNumber = acNum;
        this.balance = bal;
        this.accountHolderName = accHN;
    }
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void display() {
        System.out.println("Account Number:: " + accountNumber + " Balance:: " + balance + " AccountHolderName:: "+ accountHolderName);
    }
}


public class ParameterizedConstructorExamples {
    public static void main(String[] args) {
        BankAccount hdfc = new BankAccount(1234,45000,"Alex");
       // BankAccount hdfc = new BankAccount()

        BankAccount axisbank = new BankAccount(3456,10000, "");
        BankAccount boa = new BankAccount(123445);

        hdfc.display();
        axisbank.display();
        boa.display();



    }
}
