package br.com.viasoft.bootcampSpring.SpringRest.auth.role;

import br.com.viasoft.bootcampSpring.SpringRest.framework.CrudServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends CrudServicelmpl<Role, Integer> implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public JpaRepository<Role, Integer> getRepository() {
        return roleRepository;
    }
}
