import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<User> listOfUsers = new ArrayList<User>();
    Application(){
        listOfUsers = this.listOfUsers;
    }
    public void createUser(String userName, String password){
        User newUser = new User(userName, password);
        listOfUsers.add(newUser);
    }
    public boolean passwordValidator(String password){
        return false;
    }
}
