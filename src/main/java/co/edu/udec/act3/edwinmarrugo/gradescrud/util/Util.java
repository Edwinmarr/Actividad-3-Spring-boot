package co.edu.udec.act3.edwinmarrugo.gradescrud.util;

import co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request.StudentRequest;
import co.edu.udec.act3.edwinmarrugo.gradescrud.model.User;

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

}
