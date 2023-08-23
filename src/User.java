public class User {

    private String password;
    private String userName;
    private Account account;
    private boolean referred = false;

    public User(String userName, String password, boolean referred){
        this.userName = userName;
        this.password = password;
        this.account = new Account();
        if(referred){
            account.setBalance(500);
        }
    }

    public void setPassword(String password) {
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public double getAccountBalance() {
        return account.getBalance();
    }

}
