package co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
