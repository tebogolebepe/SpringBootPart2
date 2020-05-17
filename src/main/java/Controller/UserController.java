package Controller;

import Model.User;
import Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServices userServices;
    @GetMapping ("/User/{id}")
    public User GetUSerById(@PathVariable String id){
        System.out.println("Searched by id :" + id);
        return  userServices.GetUserById(id);
    }
}
