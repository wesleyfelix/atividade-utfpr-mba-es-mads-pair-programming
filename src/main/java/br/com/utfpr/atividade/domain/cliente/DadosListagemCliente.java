package br.com.utfpr.atividade.domain.cliente;

public record DadosListagemCliente(Long id,
                                   String nome,
                                   String email,
                                   int idade
) {
    public DadosListagemCliente(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getIdade());
    }

}
