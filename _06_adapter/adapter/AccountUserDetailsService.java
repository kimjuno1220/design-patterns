package main.java.me.wihteship.designpatterns._06_adapter.adapter;

import main.java.me.wihteship.designpatterns._06_adapter.Account;
import main.java.me.wihteship.designpatterns._06_adapter.AccountService;
import main.java.me.wihteship.designpatterns._06_adapter.user.UserDetailsService;
import main.java.me.wihteship.designpatterns._06_adapter.user.UserDetails;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
