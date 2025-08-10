package _02_structural_patterns._06_adapter;

public class Account {
/* 어댑터를 안만들 경우
public class Account implements UserDetails
 */
    private String name;

    private String password;

    private String email;
/* 어댑터를 안만들 경우
    @Override
    public String getUserName() {
        return this.name;
    }
    @Override
    public String getPassword() {
        return password;
 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

