package co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequest {
    private String numberId;
    private String typeId;
    private String password;
    private String passwordConfirmation;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
}
