package br.com.viasoft.bootcampSpring.SpringRest.auth.usuario;

import br.com.viasoft.bootcampSpring.SpringRest.framework.CrudServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends CrudServicelmpl<Usuario,Long> implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public JpaRepository<Usuario, Long> getRepository() {
        return usuarioRepository;
    }

    @Override
    public Usuario loadUserByUsername(String username) {
        Usuario user = loadUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Usuario não encontrado");
        }
        return user;
    }
}
