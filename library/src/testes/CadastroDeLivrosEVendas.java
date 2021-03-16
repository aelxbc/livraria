package testes;

import agentes.Autor;
import menus.CarrinhoDeCompras;
import produtos.*;


public class CadastroDeLivrosEVendas {

    public static void main(String[] args) {

        Autor autor =  new Autor();
        autor.setNome("David Reed");
        autor.setEmail("David_davidizinho@yahoo.com");
        autor.setCpf("000.000.000-00");

        Autor atr2 =  new Autor();
        atr2.setNome("JRR Tolkien");
        atr2.setEmail("nome2@email.com");
        atr2.setCpf("000.000.000-00");

        Autor atr3 =  new Autor();
        atr3.setNome("Ian Fraser");
        atr3.setEmail("nome3@email.com");
        atr3.setCpf("000.000.000-00");

        LivroFisico lf1 = new LivroFisico(autor);
        lf1.setNome("O Guia de caça de Bobby Singer");
        lf1.setDescricao("Matar Coisas");
        lf1.setValor(20.00);
        lf1.setIsbn("978-85-8311-059-0");
        lf1.mostrarDetalhes();

        LivroFisico lf2 = new LivroFisico(atr2);
        lf2.setNome("O Hobbit");
        lf2.setDescricao("Lá e de Volta Outra Vez");
        lf2.setValor(40.00);
        lf2.setIsbn("978-08-7548-303-0");
        lf2.mostrarDetalhes();

        Ebook ebk1 = new Ebook(atr3);
        ebk1.setNome("Araruama");
        ebk1.setDescricao("O livro das sementes ");
        ebk1.setValor(30.00);
        ebk1.setIsbn("978-85-9257-959-3");
        ebk1.mostrarDetalhes();

        CarrinhoDeCompras cdc = new CarrinhoDeCompras();

        cdc.adiciona(lf1);
        cdc.adiciona(lf2);
        cdc.adiciona(ebk1);
        cdc.adiciona(lf1);
        cdc.remove(3);

        System.out.println(cdc.getTotal());
        System.out.println(cdc.getProdutos());
    }
}
