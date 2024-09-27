package list.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // Atributos

    private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        
        if(!livroLista.isEmpty()){
            for (Livro l : livroLista){
                if (l.getAutor().equalsIgnoreCase(autor))
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <=  anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
            }
            return livrosPorIntervaloAnos;
        }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroLista.isEmpty()){
            for (Livro l : livroLista){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
        public static void main(String[] args) {

            CatalogoLivros catalogoLivros = new CatalogoLivros();

            catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
            catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
            catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
            catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
            catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

            System.out.println("Pesquisar por autor: " + catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
            System.out.println("Pesquisar por autor: " + catalogoLivros.pesquisarPorIntervaloAnos(2008, 2015));
            System.out.println("Pesquisar por autor: " + catalogoLivros.pesquisarPorTitulo("O Codificador Limpo"));
    }
    }
