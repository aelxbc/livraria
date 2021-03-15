

public class Main {

    public static void main(String[] args) {

	Autor autor =  new Autor();
	autor.setNome("David Reed");
    autor.setEmail("David_davidizinho@yahoo.com");
    autor.setCpf("000.000.000-00");

    Livro livro = new Livro( autor);
    livro.setNome("O Guia de caça de Bobby Singer");
    livro.setDescricao("Matar Coisas");
    livro.setValor(20.00);
    livro.setIsbn("978-85-8311-059-0");

    livro.mostrarDetalhes();
    }
}
