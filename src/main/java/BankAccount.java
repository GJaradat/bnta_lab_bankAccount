import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class BankAccount {

    //INSTANCE VARIABLES
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private  int accountNumber;
    private double balance;
    private String accountType;
    private boolean overdraft;

    //CONSTRUCTOR
    public BankAccount(String firstName,String lastName, LocalDate dateOfBirth,int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = "Classic Account";
        this.overdraft = false;

    }


    //Getters&Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }

    //METHODS
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if((this.balance<amount) && (!this.overdraft)){
            System.out.println("Insufficient funds!");
        }
        else {
            this.balance -= amount;
        }
    }

    public void payInterest(){
        // AccountTypes Hashmap. I DON'T KNOW WHERE TO PUT IT BUT I'm SURE IT'S NOT HERE. I JUST WANTED TO MAKE THE CODE EXTENDABLE.
        HashMap<String, Double> accountTypes = new HashMap<String, Double>();
        accountTypes.put("Classic Account",0.05);
        accountTypes.put("Easy Access Savings Account",0.1);
        accountTypes.put("High Interest Savings Account",0.2);

        if (this.balance>0){
            double interestRate = accountTypes.get(this.accountType);
            this.deposit(this.balance*interestRate);
        }
        else{
            System.out.println("Cannot pay interest due to overdraft!");

        }
    }
}
