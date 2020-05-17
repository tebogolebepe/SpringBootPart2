package Security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface WebSecurityConfigurerAdapter {
    void configure(AuthenticationManagerBuilder auth) throws Exception;
    void configure(HttpSecurity http) throws Exception;
}
