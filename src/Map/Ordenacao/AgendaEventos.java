package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){

        this.eventosMap = new HashMap<>();

    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){

        eventosMap.put(data, new Evento(nome, atracao));

    }

    public void exibirAgenda(){

        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventosTreeMap);

    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){

            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){

                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;

            }

        }


    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2021,06,05),"Evento 1", "Banda Vazio");
        agendaEventos.adicionarEvento(LocalDate.of(2022,02,10),"Evento 1", "Iron Maiden");
        agendaEventos.adicionarEvento(LocalDate.of(2023,10,15),"Evento 2", "Slayer");
        agendaEventos.adicionarEvento(LocalDate.of(2024,02,10),"Evento 3", "Ancestral Malediction");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }

}
