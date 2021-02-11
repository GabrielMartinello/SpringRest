package br.com.viasoft.bootcampSpring.SpringRest.controller;
import br.com.viasoft.bootcampSpring.SpringRest.framework.CrudRestController;
import br.com.viasoft.bootcampSpring.SpringRest.framework.CrudService;
import br.com.viasoft.bootcampSpring.SpringRest.model.Produto;
import br.com.viasoft.bootcampSpring.SpringRest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController extends CrudRestController<Produto, Long> {

    @Autowired
    ProdutoService produtoService;

    @Override
    public CrudService<Produto, Long> getService() {
        return produtoService;
    }
}
