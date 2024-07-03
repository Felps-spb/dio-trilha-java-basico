package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int ano ){
        livroList.add(new Livro(nome, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTtitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);

        // Pesquisa por autor
        System.out.println("Livros do autor 'J. R. R. Tolkien':");
        List<Livro> livrosPorAutor = catalogo.pesquisarPorAutor("J. R. R. Tolkien");
        for (Livro livro : livrosPorAutor) {
            System.out.println("Título: " + livro.getTitulo() + ", Ano: " + livro.getAnoPublicacao());
        }

        // Pesquisa por intervalo de anos
        System.out.println("\nLivros publicados entre 1940 e 1950:");
        List<Livro> livrosPorIntervalo = catalogo.pesquisarPorAno(1940, 1950);
        for (Livro livro : livrosPorIntervalo) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }

        // Pesquisa por título
        Livro livroPorTitulo = catalogo.pesquisarPorTtitulo("O Pequeno Príncipe");
        if (livroPorTitulo != null) {
            System.out.println("\nLivro encontrado: " + livroPorTitulo.getTitulo() + ", Autor: " + livroPorTitulo.getAutor());
        } else {
            System.out.println("\nLivro não encontrado.");
        }
    }
}
    
