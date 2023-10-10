package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){

        this.itemList = new ArrayList<>();

    }

    public void adicionarItem(String nome, double preco, int quantidade){

        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);

    }

    public void removerItem(String nome) {

        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {

                    itensParaRemover.add(i);

                }
            }
            itemList.removeAll(itensParaRemover);

        } else {

            System.out.println("O carrinho está vazio!");

        }
    }
    public void exibirItens(){
        if (!itemList.isEmpty()) {
        System.out.println(itemList);
        } else {

            System.out.println("O carrinho está vazio!");

        }

    }

    public void calcularValorTotal() {
        if (!itemList.isEmpty()) {
            double total = 0;
            for (Item i : itemList) {

                int qtde = i.getQuantidade();
                double preco = i.getPreco();
                total += qtde * preco;

            }
            System.out.println("Valor total da compra: " + total);
        } else {

        System.out.println("O carrinho está vazio!");

    }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("arroz",2.5,5);
        carrinhoDeCompras.adicionarItem("feijão",3.5,2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }

}
