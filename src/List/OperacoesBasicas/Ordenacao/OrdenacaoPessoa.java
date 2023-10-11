package List.OperacoesBasicas.Ordenacao;

import List.OperacoesBasicas.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    //Atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){

        this.pessoaList = new ArrayList<>();

    }

    public void adicionarPessoa(String nome, int idade, double altura){

        pessoaList.add(new Pessoa( nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade(){

        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Jose",40,1.82);
        ordenacaoPessoa.adicionarPessoa("Joana",25,1.92);
        ordenacaoPessoa.adicionarPessoa("Joao",30,1.50);
        ordenacaoPessoa.adicionarPessoa("Maria",40,1.70);

        //System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }

}
