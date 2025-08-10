package _02_structural_patterns._06_adapter;

public class AccountService {
/* 어댑터를 안만들 경우
public class AccountService implements UserDetailService {
 */
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
/* 어댑터를 안만들 경우
    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = findAccountByUsername(username); // 생략
        return findAccountByUsername(username);
 */

}