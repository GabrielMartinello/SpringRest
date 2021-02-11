package br.com.viasoft.bootcampSpring.SpringRest.service;

import br.com.viasoft.bootcampSpring.SpringRest.framework.CrudService;
import br.com.viasoft.bootcampSpring.SpringRest.model.Produto;
import org.springframework.stereotype.Service;

public interface ProdutoService extends CrudService<Produto,Long> {
}
