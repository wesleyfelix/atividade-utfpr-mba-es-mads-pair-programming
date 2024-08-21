package br.com.utfpr.atividade.domain.produto;

public record DadosListagemProduto(
        Long id,
        String nome,
        String categoria,
        double preco,
        int quantidade) {
    public DadosListagemProduto(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getCategoria(), produto.getPreco(), produto.getQuantidade());
    }
}
