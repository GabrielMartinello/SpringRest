package br.com.viasoft.bootcampSpring.SpringRest.repository;


import br.com.viasoft.bootcampSpring.SpringRest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
