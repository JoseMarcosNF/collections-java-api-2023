package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){

        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone){
        //o comendo put atualiza o registro passando por cima do registro atual se o mesmo tiver a mesma chave
        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato(String nome){
        //Não é necessario um for uma vez que o map só contem uma chave de cada registro, nesse caso o nome
        if (!agendaContatoMap.isEmpty()){

            agendaContatoMap.remove(nome);

        }

    }

    public void exibirContato(){

        System.out.println(agendaContatoMap);

    }

    public Integer pesquisarPorNome(String nome) {

        Integer numeroPorNome = null;

        if (!agendaContatoMap.isEmpty()) {

            agendaContatoMap.get(nome);

        }

        return numeroPorNome;
    }


    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João",123123123);
        agendaContatos.adicionarContato("João",3211231);
        agendaContatos.adicionarContato("José Marcos",12312323);
        agendaContatos.adicionarContato("Maria",12312323);

        //agendaContatos.removerContato("Maria");

        agendaContatos.pesquisarPorNome("Maria");
        
        //agendaContatos.exibirContato();

    }

    }





