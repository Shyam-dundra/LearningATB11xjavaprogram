package ex_08_Oops_Encapsulation;



public class ex_01_EN_Bank {
    public static void main(String[] args) {
        BankAccount Account = new BankAccount("shyam", 1500);
        
        
        System.out.println("Account holder name: " + Account.getAccountHolderName());
        Account.setAccountHolderName("Krishna");
        System.out.println("Updated Acoount holder name: " + Account.getAccountHolderName());


        Account.deposit(100);
        Account.withdraw(200);

        System.out.println("Final balance: "+ Account.getBalance());
    }



}
class BankAccount{

    private String Account_Holder;
    private double balance;

    public BankAccount(String Account_Holder, double Intialbalance){
        this.Account_Holder = Account_Holder;
        this.balance = Intialbalance;

    }
    public String getAccountHolderName() {
        return Account_Holder;
    }
    public void setAccountHolderName(String Account_Holder){
     
        this.Account_Holder = Account_Holder;

    }
    public double getBalance(){
        return balance;

    }
    public void deposit(double amount){

        if (amount>0){
            balance += amount;
            System.out.println("Deposit: " + amount);
        }else{
            System.out.println("Deposit amount must be positive");
        }

    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }else{
            System.out.println("Insufficient balance in account");
        }
    }

}
