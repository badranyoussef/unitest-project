import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {



    @Test
    void setUserNameTest(){
        User user1 = new User("test","1234");
        user1.setUserName("test4");

        assertEquals("test",user1.getUserName());
    }



}