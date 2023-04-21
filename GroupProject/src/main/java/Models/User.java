package Models;

public class User {
   final private String UserName;
   final private String Password;
   final private String AccountType;

    public User(String UserName, String Password, String AccountType) {
        this.UserName = UserName;
        this.Password = Password;
        this.AccountType = AccountType;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getAccountType() {
        return AccountType;
    }
}
