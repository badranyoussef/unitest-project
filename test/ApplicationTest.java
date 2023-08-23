import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void createUserTest() {
        Application mySys = new Application();
        mySys.createUser("youssef","123456", true);
        assertEquals("youssef", mySys.getListOfUsers().get(0).getUserName());
        assertEquals(1, mySys.getListOfUsers().size());
    }

    @Test
    void passwordValidator() {
        Application mySys = new Application();
        boolean validation = mySys.passwordValidator("jhrdgrdj");
        assertEquals(true, validation);
    }
}