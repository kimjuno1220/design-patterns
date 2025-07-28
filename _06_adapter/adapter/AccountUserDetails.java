package main.java.me.wihteship.designpatterns._06_adapter.adapter;

import main.java.me.wihteship.designpatterns._06_adapter.Account;
import main.java.me.wihteship.designpatterns._06_adapter.user.UserDetails;

public class AccountUserDetails implements UserDetails{

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }

}
