import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount();
        bankAccount.firstName = "Gabriel";
        bankAccount.lastName = "Dzharadat";
        bankAccount.dateOfBirth = LocalDate.of(1997,1,3);
        bankAccount.accountNumber = 133742069;
    }

    //GETTERS AND SETTERS TESTING SUITE
    @Test
    public void canGetFirstName(){
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo(bankAccount.firstName);
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Gary");
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo("Gary");
    }

    @Test
    public void canGetLastName(){
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo(bankAccount.lastName);
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Jaradat");
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo("Jaradat");
    }

    @Test
    public void canGetDateOfBirth(){
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(bankAccount.dateOfBirth);
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth(2000,1,3);
        String actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo("not sure");
    }

    @Test
    public void canGetAccountNumber(){
        String actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(bankAccount.accountNumber);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(999999999);
        String actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(999999999);
    }

    @Test
    public void canGetBalance(){
        String actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(bankAccount.balance);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(1000000);
        String actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(1000000);
    }

    //METHOD TESTING SUITE
    
}
