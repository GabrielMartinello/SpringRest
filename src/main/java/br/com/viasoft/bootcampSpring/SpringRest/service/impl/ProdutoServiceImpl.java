package br.com.viasoft.bootcampSpring.SpringRest.service.impl;

import br.com.viasoft.bootcampSpring.SpringRest.framework.CrudServicelmpl;
import br.com.viasoft.bootcampSpring.SpringRest.model.Produto;
import br.com.viasoft.bootcampSpring.SpringRest.repository.ProdutoRepository;
import br.com.viasoft.bootcampSpring.SpringRest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl extends CrudServicelmpl<Produto, Long> implements ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public JpaRepository<Produto, Long> getRepository() {
        return produtoRepository;

    }

}
