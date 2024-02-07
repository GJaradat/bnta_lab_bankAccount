import java.time.LocalDate;

public class BankAccount {

    //INSTANCE VARIABLES
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private  int accountNumber;
    private float balance;

    //CONSTRUCTOR
    public BankAccount(String firstName,String lastName, LocalDate dateOfBirth,int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
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

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    //METHODS
//    public void deposit(float amount){
//        this.balance += amount;
//    }
//
//    public void withdraw(float amount){
//        this.balance -= amount;
//    }
//

}
