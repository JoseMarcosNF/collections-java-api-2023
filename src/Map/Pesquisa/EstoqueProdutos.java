package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos (){

        this.estoqueProdutosMap = new HashMap<>();

    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){

        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
        //O programa em si está dando erro indicando que precisaria de 4 atributos onde só se passam 3(nome, preco, quantidade)
        //na aula para a professora funcionou, mas aqui não. Encontrar a solução
    }

    public void exibirProdutos(){

        System.out.println(estoqueProdutosMap);

    }

    public double calcularValorTotalEstoque(){

            double valorTotalEstoque = 0;

        if (!estoqueProdutosMap.isEmpty()){

            for (Produto p : estoqueProdutosMap.values()){

                valorTotalEstoque += p.getPreco()*p.getQuantidade();

            }

        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()){

            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }

            }

        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto 1", 10, 5);

        estoque.exibirProdutos();
    }

}
