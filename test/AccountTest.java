import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;
    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void balanceTest(){

        assertEquals(0,account.getBalance());
    }
}