package abstraction;

abstract class Bank{


    abstract void withdrawMoney(double amount);

//concrete method
    public void checkBalanace(){
     System.out.println("Checking balance...");
      }
 }

 class ATM  extends Bank {



     @Override
     void withdrawMoney(double amount) {
         System.out.println("Withdrawing amount from ATM "+ amount );
     }
}

class onlineBanking extends Bank {

    @Override
    void withdrawMoney(double amount) {
        System.out.println("Withdrawing amount from OnlineBanking:: "+ amount );
    }
}

public class BankAbstractionExample {
    public static void main(String[] args) {
       Bank bank;

      //  Bank bank1 = new ATM();
        bank = new ATM();
        bank.withdrawMoney(500);


        bank = new onlineBanking();
        bank.withdrawMoney(1000.5);
        bank.checkBalanace();
    }

}
