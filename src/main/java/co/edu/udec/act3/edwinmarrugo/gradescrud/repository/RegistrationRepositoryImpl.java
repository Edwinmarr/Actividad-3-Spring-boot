package co.edu.udec.act3.edwinmarrugo.gradescrud.repository;

import co.edu.udec.act3.edwinmarrugo.gradescrud.model.Student;
import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;
import co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao.StudentDao;
import co.edu.udec.act3.edwinmarrugo.gradescrud.repository.dao.UserDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {
    @Autowired
    private UserDao userDao;
    @Autowired
    private StudentDao studentDao;
    @Override
    @Transactional
    public Boolean registerStudent(User user) {
        Student student = new Student();
        student.setCode("");
        student.setUser(user);
        userDao.save(user);
        studentDao.save(student);
        return true;
    }
}
