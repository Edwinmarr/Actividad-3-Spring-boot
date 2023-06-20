package co.edu.udec.act3.edwinmarrugo.gradescrud.util;

import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Util {
    private Util() {
    }
    public static User mapToUser(StudentRequest studentRequest){
        return User.builder()
                .email(studentRequest.getEmail())
                .typeId(studentRequest.getTypeId())
                .numberId(studentRequest.getNumberId())
                .password(studentRequest.getPassword())
                .firstName(studentRequest.getFirstName())
                .middleName(studentRequest.getMiddleName())
                .lastName(studentRequest.getLastName())
                .secondLastName(studentRequest.getSecondLastName())
                .build();
    }

    public static boolean verifyPassword(String password, String encryptedPassword) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        String encodedPassword = Base64.getEncoder().encodeToString(encodedHash);
        return encodedPassword.equals(encryptedPassword);
    }

}
