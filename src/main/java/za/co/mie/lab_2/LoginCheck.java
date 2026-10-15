package za.co.mie.lab_2;

public class LoginCheck {
    String username;
    String password;
    public void storeInfo(String p_username, String p_password){
        username = p_username;
        password = p_password;
    }
    public String checkInfo(String p_username, String p_password){
        return (username.equals(p_username) && password.equals(p_password)) ? "Login successful" : "Invalid credentials";
    }
}
