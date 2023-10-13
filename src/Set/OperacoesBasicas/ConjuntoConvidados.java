package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){

        this.convidadosSet = new HashSet<>();

    }

    public void adicionarConvidado(String nome, int codigoConvite){

        convidadosSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadosSet){

            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                System.out.println("Removido "+convidadoParaRemover);
                break;
            }

        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){

        return convidadosSet.size();

    }

    public void exibirConvidados(){

        System.out.println(convidadosSet);

    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("joão",123);
        //conjuntoConvidados.adicionarConvidado("joão",123);
        conjuntoConvidados.adicionarConvidado("joãna",1234);
        conjuntoConvidados.adicionarConvidado("Zananão",1235);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Total de convidados: "+conjuntoConvidados.contarConvidados());

    }

}
