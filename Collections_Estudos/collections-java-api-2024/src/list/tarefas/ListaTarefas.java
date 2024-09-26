package list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributo lista tarefa

    private List<Tarefa> tarefaList;


    //metodo construtor da classe
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    // Recebe uma descricao como parametro e adiciona atraves do construtor tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //Faz uma interacao sobre a lista mapeando todos que possuem valor identico e depois remove todos de uma vez da lista
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for ( Tarefa t : tarefaList){
            if ( t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //Retorna o tamanho total da lista
    public int obterNumeroTotaldeTarefas(){
        return tarefaList.size();
    }

    //Retorna todas as descricoes das tarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotaldeTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotaldeTarefas());

        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotaldeTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
