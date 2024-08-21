package br.com.utfpr.atividade.controller;

import br.com.utfpr.atividade.domain.produto.DadosListagemProduto;
import br.com.utfpr.atividade.domain.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutosController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<Page<DadosListagemProduto>> listar(@PageableDefault(page = 0, size = 10, sort = {"id"}) Pageable paginacao){
        var page = produtoRepository.findAll(paginacao).map(DadosListagemProduto::new);
        return ResponseEntity.ok(page);
    }
}
