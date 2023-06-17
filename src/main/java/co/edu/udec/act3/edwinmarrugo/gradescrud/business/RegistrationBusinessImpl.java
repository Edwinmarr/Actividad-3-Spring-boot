package co.edu.udec.act3.edwinmarrugo.gradescrud.business;

import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import co.edu.udec.act3.edwinmarrugo.gradescrud.repository.RegistrationRepository;
import co.edu.udec.act3.edwinmarrugo.gradescrud.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class RegistrationBusinessImpl implements RegistrationBusiness {
    @Autowired
    private RegistrationRepository registrationRepository;
    @Override
    public ResponseEntity<Void> registerStudent(StudentRequest studentRequest) {
        if (registrationRepository.registerStudent(Util.mapToUser(studentRequest))){
            return ResponseEntity.created(URI.create("/registration/student")).build();
        }else {
            return ResponseEntity.internalServerError().build();
        }
    }
}
