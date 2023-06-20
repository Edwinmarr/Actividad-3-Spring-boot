package co.edu.udec.act3.edwinmarrugo.gradescrud.business;

import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import co.edu.udec.act3.edwinmarrugo.gradescrud.repository.RegistrationRepository;
import co.edu.udec.act3.edwinmarrugo.gradescrud.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Service
public class RegistrationBusinessImpl implements RegistrationBusiness {
    @Autowired
    private RegistrationRepository registrationRepository;
    @Override
    public void registerStudent(StudentRequest studentRequest) throws NoSuchAlgorithmException {
        String encryptedPassword = validateAndEncryptPassword(studentRequest.getPassword(), studentRequest.getPasswordConfirmation());
        studentRequest.setPassword(encryptedPassword);
        registrationRepository.registerStudent(Util.mapToUser(studentRequest));
    }
    private String validateAndEncryptPassword(String password, String passwordValidation) throws NoSuchAlgorithmException {
        if (password.equals(passwordValidation)) {
            return encryptPassword(password);
        } else {
            throw new IllegalArgumentException("Passwords do not match.");
        }
    }
    private String encryptPassword (String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encodedHash);
    }

}
