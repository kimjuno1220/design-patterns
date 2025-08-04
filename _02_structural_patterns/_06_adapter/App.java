package main.java.me.whiteship.designpatterns._02_structural_patterns._06_adapter;

import main.java.me.whiteship.designpatterns._02_structural_patterns._06_adapter.user.LoginHandler;
import main.java.me.whiteship.designpatterns._02_structural_patterns._06_adapter.adapter.AccountUserDetailsService;
import main.java.me.whiteship.designpatterns._02_structural_patterns._06_adapter.user.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("kjo9577","kjo9577");
        System.out.println(login);
    }
}
