package Security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class WebSecurityConfigurer implements WebSecurityConfigurerAdapter {
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
                .passwordEncoder(encoder)
                .withUser("USer1")
                .password(encoder.encode("tebogo"))
                .roles("USER");

    }

    @Override
    public void configure(HttpSecurity http)throws  Exception {
        http.authorizeRequests()
                .antMatchers("/User")
                .authenticated()
                .antMatchers("User")
                .permitAll()
                .and()
                .httpBasic();
    }
}
