import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

public class SpringBoot {
    @SpringBootApplication
    @EnableCaching
    public static class CachingApplication{
        public  static void main(String[] args){
            SpringApplication.run(CachingApplication.class,args);

        }

    }

}
