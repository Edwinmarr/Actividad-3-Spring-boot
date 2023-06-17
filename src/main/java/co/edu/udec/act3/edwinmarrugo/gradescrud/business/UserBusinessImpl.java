package co.edu.udec.act3.edwinmarrugo.gradescrud.business;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;
import co.edu.udec.act3.edwinmarrugo.gradescrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBusinessImpl implements UserBusiness {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> showUsers() {
        return userRepository.findAll();
    }
}
