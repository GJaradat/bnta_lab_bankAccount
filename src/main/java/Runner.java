import java.time.LocalDate;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Hello customer! Welcome to Bright Bank!");
        System.out.println("Here is your demo account: ");
        LocalDate dob = LocalDate.of(1997,1,3);
        BankAccount bankAccount = new BankAccount("Gabriel","Dzharadat",dob,133742069);

        System.out.println(bankAccount);
        System.out.println("Your account is a " + bankAccount.getAccountType());
        bankAccount.setBalance(1000);
        System.out.println("Your current balance is £" + bankAccount.getBalance());

        //Withdraw or deposit
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to deposit or withdraw?");
        String input = scan.nextLine();
        System.out.println(input);

        if (input.equals("withdraw")){
            System.out.println("How much would you like to withdraw?");
            int input2 = Integer.parseInt(scan.nextLine());
            bankAccount.withdraw(input2);
            System.out.println("You withdrew £" + input2 + ". Your balance is now £" + bankAccount.getBalance());
        }
        else if (input.equals("deposit")){
            System.out.println("How much would you like to deposit?");
            int input2 = Integer.parseInt(scan.nextLine());
            bankAccount.deposit(input2);
            System.out.println("You deposited £" + input2 + ". Your balance is now £" + bankAccount.getBalance());
        }
        else{
            System.out.println("Unrecognised command. Abort.");
        }
        System.out.println("Have a nice day!");


    }

}
