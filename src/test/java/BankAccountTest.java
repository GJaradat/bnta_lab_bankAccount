import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        LocalDate dob = LocalDate.of(1997,1,3);
        bankAccount = new BankAccount("Gabriel","Dzharadat",dob,133742069);
    }

    //GETTERS AND SETTERS TESTING SUITE
    @Test
    public void canGetFirstName(){
        String actual = bankAccount.getFirstName();
        assertThat(actual).isEqualTo("Gabriel");
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
        assertThat(actual).isEqualTo("Dzharadat");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Jaradat");
        String actual = bankAccount.getLastName();
        assertThat(actual).isEqualTo("Jaradat");
    }

    @Test
    public void canGetDateOfBirth(){
        LocalDate actual = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1997,1,3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth(LocalDate.of(2000,3,4));
        LocalDate expected = LocalDate.of(2000,3,4);
        LocalDate actual = bankAccount.getDateOfBirth();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber(){
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(133742069);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(999999999);
        int actual = bankAccount.getAccountNumber();
        assertThat(actual).isEqualTo(999999999);
    }

    @Test
    public void canGetBalance(){
        float actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(1000000);
        float actual = bankAccount.getBalance();
        assertThat(actual).isEqualTo(1000000);
    }

    //METHOD TESTING SUITE

}
