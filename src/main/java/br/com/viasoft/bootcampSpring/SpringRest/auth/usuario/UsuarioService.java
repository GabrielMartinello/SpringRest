package br.com.viasoft.bootcampSpring.SpringRest.auth.usuario;

import br.com.viasoft.bootcampSpring.SpringRest.framework.CrudService;

public interface UsuarioService extends CrudService<Usuario,Long> {
    Usuario loadUserByUsername(String username);
}
