package br.com.utfpr.atividade.controller;

import br.com.utfpr.atividade.domain.cliente.DadosListagemCliente;
import br.com.utfpr.atividade.domain.cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClientesController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<Page<DadosListagemCliente>> listar(@PageableDefault(page = 0, size = 10, sort = {"id"}) Pageable paginacao){
        var page = clienteRepository.findAll(paginacao).map(DadosListagemCliente::new);
        return ResponseEntity.ok(page);
    }


}
