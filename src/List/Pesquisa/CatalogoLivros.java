package List.OperacoesBasicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;
    //Construtor
    public CatalogoLivros(){

        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        livroList.add(new Livro( titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisaPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()){

            for (Livro l : livroList ){

                if (l.getAutor().equalsIgnoreCase(autor)){

                    livrosPorAutor.add(l);

                }

            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!livroList.isEmpty()){

            for (Livro l : livroList ){

                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){

                    livrosPorIntervaloAnos.add(l);

                }

            }

        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()){

            for (Livro l : livroList){

                if (l.getTitulo().equalsIgnoreCase(titulo)){

                    livroPorTitulo = l;
                    break;

                }

            }

        }
            return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Dracula", "Bran Stoker",1897);
        catalogoLivros.adicionarLivro("Frankenstein", "Mary Shelley",1818);
        catalogoLivros.adicionarLivro("O chamado de cthulhu", "H. P. Lovecraft",1928);
        //catalogoLivros.pesquisaPorAutor("Mary Shelley");
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1800,1900));
    }
}


