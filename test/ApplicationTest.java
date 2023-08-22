import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void createUser() {
        Application mySys = new Application();
        User firstUser = new User("Henrik", "1234lpos");
        assertEquals("Henrik", firstUser.getUserName());
    }

    @Test
    void passwordValidator() {
        Application mySys = new Application();
        boolean validation = mySys.passwordValidator("jhrdgrdj");
        assertEquals(true, validation);
    }
}