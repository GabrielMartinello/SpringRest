package br.com.viasoft.bootcampSpring.SpringRest.controller;


import br.com.viasoft.bootcampSpring.SpringRest.auth.usuario.Usuario;
import br.com.viasoft.bootcampSpring.SpringRest.auth.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrar")
    String register(@RequestParam("username") final String username,
                    @RequestParam("password") final String password) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuarioService.save(usuario);

        return "a";

    }
}
