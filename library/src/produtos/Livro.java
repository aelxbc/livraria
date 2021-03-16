package produtos;

import agentes.Autor;
import exception.AutorNuloException;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro (Autor autor) {
        if (autor == null) {
            throw new AutorNuloException("O Autor não pode ser nulo");
        }

        this.autor =  autor;
        this.isbn = "000-00-00000-00-0";
    }

    public void mostrarDetalhes(){

        System.out.println("--- Mostrando detalhes do livro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if ( this.temAutor() ) {
            autor.mostrarDetalhes();
        }

        System.out.println("\n-----------------------\n");
    }

    public boolean temAutor() {
        return this.autor != null;
    }

    public String getNome (String nome) {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao (String descricao) {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor)
    {
        this.autor = autor;
    }

    @Override
    public int compareTo(Produto outro) {

        if (this.getValor() < outro.getValor()) {
            return -1;
        }
        if (this.getValor() > outro.getValor()) {
            return 1;
        }

        return 0;
    }
}



