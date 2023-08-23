import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<User> listOfUsers = new ArrayList<User>();
    Application(){
        listOfUsers = this.listOfUsers;
    }
    public void createUser(String userName, String password){
        boolean validation = passwordValidator(password);
        if(validation){
            User newUser = new User(userName, password);
            listOfUsers.add(newUser);
        }
        else{
            System.out.println("Password must be longer than 5 characters and less than 15.");
        }
    }
    public boolean passwordValidator(String password){
        if(password.length() > 5 && password.length() < 15){
            return true;
        }
        return false;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }
}
