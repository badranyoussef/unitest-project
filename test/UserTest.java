import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void setUserNameTest(){
        User user1 = new User("test","1234", true);
        user1.setUserName("test4");

        assertEquals("test",user1.getUserName());
    }

    @Test
    void setPasswordTest(){
        User user1 = new User("test","1111");
        user1.setPassword("111");

        assertEquals("111",user1.getPassword());

    }


}