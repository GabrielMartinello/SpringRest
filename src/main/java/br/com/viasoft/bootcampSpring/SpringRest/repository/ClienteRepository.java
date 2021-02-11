package br.com.viasoft.bootcampSpring.SpringRest.repository;

import br.com.viasoft.bootcampSpring.SpringRest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface
ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findAllByNome(String nome);
    List<Cliente> findByNomeContainsIgnoreCase(String nome);
}
