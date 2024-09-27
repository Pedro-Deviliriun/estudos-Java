package list.SomaDeNumeros;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
   
    @Override
    public String toString() {
        return "[numerosSoma=" + numerosSoma + "]";
    }

    List<Integer> numerosSoma;

    public SomaNumeros(){
        this.numerosSoma = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero){
        numerosSoma.add(numero);
    }

    public Integer calcularSoma(){

        Integer valorTotal = 0;

        if(!numerosSoma.isEmpty()){
            for(Integer i : numerosSoma){
                valorTotal = i + valorTotal;
            }
        }
        return valorTotal;
    }

    public Integer encontrarMaiorNumero(){
        Integer numeroMaior = 0;

        if(!numerosSoma.isEmpty()){
            for(Integer i : numerosSoma){
                if( i > numeroMaior){
                    numeroMaior = i;
                    }
                }
            }
        return numeroMaior;
        }
    public int encontrarMenorNumero(){

       int numeroMenor = 0;

       for(int i : numerosSoma){
        if(numeroMenor== 0 ){
            numeroMenor = i;
        }else if(i < numeroMenor){
            numeroMenor = i;
        }
       }
       return numeroMenor;
    }

    public void exibirNumeros(){
        System.out.println(numerosSoma);
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(2);
        soma.adicionarNumero(7);
        soma.adicionarNumero(8);
        soma.adicionarNumero(1);
        soma.adicionarNumero(2);
        soma.adicionarNumero(9);
        soma.adicionarNumero(11);
        soma.adicionarNumero(10);

        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());
        soma.exibirNumeros();
    }
}
