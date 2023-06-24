package co.edu.udec.act3.edwinmarrugo.gradescrud.domain.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
