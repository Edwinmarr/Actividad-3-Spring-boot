package co.edu.udec.act3.edwinmarrugo.gradescrud.business;

import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;

import java.security.NoSuchAlgorithmException;

public interface RegistrationBusiness {
    void registerStudent(StudentRequest studentRequest) throws NoSuchAlgorithmException;
}
