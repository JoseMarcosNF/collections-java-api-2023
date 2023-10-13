package Set.Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(){

        this.produtoSet = new HashSet<>();

    }

    public void adicionarProduto (long codigo, String nome, double preco, int quantidade){

        produtoSet.add(new Produto(codigo, nome, preco, quantidade ));

    }

    public Set<Produto> exibirProdutosPorNome(){

        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){

        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        //

        produtoSet.addAll(produtoSet);

        return produtosPorPreco;
    }
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123,"Parafuso",0.5,100);
        cadastroProdutos.adicionarProduto(124,"Parafuso2",0.5,100);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}
