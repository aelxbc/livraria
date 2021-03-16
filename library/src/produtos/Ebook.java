package produtos;

import agentes.Autor;

public class Ebook extends Livro {

    private String marcaDagua;

    public Ebook(Autor autor) {
        super(autor);
    }

    public void setMarcaDagua(String marcaDagua){
        this.marcaDagua = marcaDagua;
    }

    public String getMarcaDagua(){
        return this.marcaDagua;
    }

}
