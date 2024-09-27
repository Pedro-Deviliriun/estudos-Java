package list.tarefas;

public class Tarefa {
    //Atributo descrição
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }

}
