package _02_structural_patterns._06_adapter.adapter;

import _02_structural_patterns._06_adapter.Account;
import _02_structural_patterns._06_adapter.AccountService;
import _02_structural_patterns._06_adapter.user.UserDetailsService;
import _02_structural_patterns._06_adapter.user.UserDetails;

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
