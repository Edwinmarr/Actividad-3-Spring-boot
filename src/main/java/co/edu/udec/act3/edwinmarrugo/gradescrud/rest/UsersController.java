package co.edu.udec.act3.edwinmarrugo.gradescrud.rest;

import co.edu.udec.act3.edwinmarrugo.gradescrud.business.RegistrationBusiness;
import co.edu.udec.act3.edwinmarrugo.gradescrud.business.UserBusiness;
import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UserBusiness userBusiness;
    @Autowired
    private RegistrationBusiness registrationBusiness;
    @GetMapping
    public List<User> getUsers(){
        return userBusiness.showUsers();
    }

    @PostMapping("registration")
    public String registerStudent(
            @ModelAttribute("user") StudentRequest studentRequest) throws NoSuchAlgorithmException {
        registrationBusiness.registerStudent(studentRequest);
        return "index";
    }
    @GetMapping("/registration-form")
    public String registration(
            @ModelAttribute("user") StudentRequest studentRequest
    ){
        return "registration";
    }
}
