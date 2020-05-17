package Services;

import Model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Cacheable ("User")
    public User GetUserById(String id){
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return new User(56454546,"Sajal" ,"V");
    }

}
