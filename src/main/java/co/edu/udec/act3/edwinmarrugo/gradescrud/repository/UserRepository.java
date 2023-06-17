package co.edu.udec.act3.edwinmarrugo.gradescrud.repository;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
