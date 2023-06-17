package co.edu.udec.act3.edwinmarrugo.gradescrud.rest;

import co.edu.udec.act3.edwinmarrugo.gradescrud.business.RegistrationBusiness;
import co.edu.udec.act3.edwinmarrugo.gradescrud.business.UserBusiness;
import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {
    @Autowired
    private UserBusiness userBusiness;
    @Autowired
    private RegistrationBusiness registrationBusiness;
    @GetMapping
    public List<User> getUsers(){
        return userBusiness.showUsers();
    }

    @PostMapping("/registration/student")
    public ResponseEntity<Void> registerStudent(@RequestBody StudentRequest studentRequest){
        return registrationBusiness.registerStudent(studentRequest);
    }
}
