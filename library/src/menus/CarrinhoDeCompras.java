package menus;

import produtos.*;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto) {
        this.total += produto.getValor();
        this.produtos.add(produto);
    }

    public void remove(int posicao) {
        Produto produto = produtos.get(posicao);
        this.total -= produto.getValor();
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}
