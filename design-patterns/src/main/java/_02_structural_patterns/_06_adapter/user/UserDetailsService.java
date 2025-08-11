package _02_structural_patterns._06_adapter.user;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
