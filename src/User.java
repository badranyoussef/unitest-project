public class User {

    private String password;
    private String userName;


    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void setPassword(String password) {
    }

    public void setUserName(String userName){

    }

    public String getUserName(){
        return userName;
    }

}
