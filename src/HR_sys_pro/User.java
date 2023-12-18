package HR_sys_pro;

//Interface for User
public interface User {
String getUsername();
String getPassword();
String login(String username, String password);
}
