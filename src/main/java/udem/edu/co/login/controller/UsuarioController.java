package udem.edu.co.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.login.model.Usuario;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1")
public class UsuarioController {

    @GetMapping("/usuarios/")
    public ResponseEntity<List<Usuario>> getNovedades(@RequestParam("id")int idUsuario){
        return null;

    }
    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> updateEnfermedad(@RequestBody() Usuario usuario){
        return null;

    }
    @PutMapping("/usuarios")




}
