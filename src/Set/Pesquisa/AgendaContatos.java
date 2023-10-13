package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(){

        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero){

        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContato(){

        System.out.println(contatoSet);

    }

    public Set<Contato> pesquisarPorNome(String nome){

        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet){

            if(c.getNome().startsWith(nome)){

                contatosPorNome.add(c);

            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroDeContato (String nome, int novoNumero){

        Contato contatoAtualizado = null;

        for (Contato c : contatoSet){

            if (c.getNome().equalsIgnoreCase(nome)){

                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;

            }

        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Luiza",1232);
        agendaContatos.adicionarContato("Luiza",12232);
        agendaContatos.adicionarContato("José",123213123);
        agendaContatos.adicionarContato("Luiz",4533434);
        agendaContatos.adicionarContato("Sandra",12323);

        //agendaContatos.exibirContato();

        //agendaContatos.atualizarNumeroDeContato("Sandra",232323);

        //agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Luiz"));
    }

}
