package udem.edu.co.login.model;

import jakarta.persistence.Table;
import lombok.Data;


/**
 *
 * @author AlejandraMarin
 */
@Data
@Table(name="Usuarios")

public class Usuario {
    private String nombre;
    private String password;
    private String usuario;
    private String correo;

}
