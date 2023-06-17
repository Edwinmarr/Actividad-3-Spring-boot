package co.edu.udec.act3.edwinmarrugo.gradescrud.business;

import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import org.springframework.http.ResponseEntity;

public interface RegistrationBusiness {
    ResponseEntity<Void> registerStudent(StudentRequest studentRequest);
}
