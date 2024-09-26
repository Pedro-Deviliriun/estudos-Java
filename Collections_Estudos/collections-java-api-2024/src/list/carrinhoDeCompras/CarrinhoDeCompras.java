package list.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompra;

    public CarrinhoDeCompras() {
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompra.add(new Item(nome, preco, quantidade));    
    }

    public void removerItem(String nome){
        List<Item> itemsARemover = new ArrayList<>();

        for(Item i : carrinhoCompra){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsARemover.add(i);
            }
        }        
        carrinhoCompra.removeAll(itemsARemover);
                
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : carrinhoCompra){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println(valorTotal);
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras CarrinhoDeCompras = new CarrinhoDeCompras();

        CarrinhoDeCompras.exibirItens();
        CarrinhoDeCompras.adicionarItem("cebola", 0.5, 20);
        CarrinhoDeCompras.adicionarItem("tomate", 0.75, 13);
        CarrinhoDeCompras.adicionarItem("pao puma", 7.5, 4);
        CarrinhoDeCompras.adicionarItem("cebola", 0.5, 4);

        CarrinhoDeCompras.exibirItens();

        CarrinhoDeCompras.exibirItens();
        CarrinhoDeCompras.calcularValorTotal();
    }
}
