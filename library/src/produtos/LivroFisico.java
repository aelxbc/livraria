package produtos;

import agentes.Autor;

public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaDeImpressao(){

        return this.getValor() * 0.25;
    }
}
