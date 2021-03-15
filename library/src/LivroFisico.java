public class LivroFisico  extends Livro {

    public LivroFisico (Autor autor) {
        super(autor);
    }
    public double getTaxadeimpressao(){

        return this.getValor() * 0.25;
    }
}
