package co.edu.udec.act3.edwinmarrugo.gradescrud.repository;

import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import co.edu.udec.act3.edwinmarrugo.gradescrud.model.Student;
import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;

public interface RegistrationRepository {
    Boolean registerStudent(User user);
}
