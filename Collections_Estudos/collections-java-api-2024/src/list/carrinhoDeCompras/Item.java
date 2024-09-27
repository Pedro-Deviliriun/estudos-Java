package list.carrinhoDeCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String no, double pr, int qtd){
        this.nome = no;
        this.preco = pr;
        this.quantidade = qtd;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString(){
        return nome;
    }
}
