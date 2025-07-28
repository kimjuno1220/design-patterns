package main.java.me.wihteship.designpatterns._06_adapter.user;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
