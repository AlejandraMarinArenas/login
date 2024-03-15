package udem.edu.co.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Usuario {
    private String name;
    private String cedula;
    private String user;
    private String password;

}
