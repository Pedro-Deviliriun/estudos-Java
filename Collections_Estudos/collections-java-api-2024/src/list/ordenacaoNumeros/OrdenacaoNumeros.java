package list.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros {

    private List<Integer> numeroList;

      public OrdenacaoNumeros() {
    this.numeroList = new ArrayList<>();
  }

    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }  else {
            throw new RuntimeException("A lista está vazia.");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numeroDescendente = new ArrayList<>(this.numeroList);

        if(!numeroList.isEmpty()){
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirNumeros(){
        System.out.println(this.numeroList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
