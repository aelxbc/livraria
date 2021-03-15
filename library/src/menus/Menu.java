package menus;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Menu {

    public void exibeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-\n2-\n3-\n4-\nEscolha: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar livro");
                exibeMenu();
                break;
            case 2:
                System.out.println("Cadastrar autor");
                exibeMenu();
                break;
            case 3:
                System.out.println("Comprar livros");
                exibeMenu();
                break;
            case 4:
                break;
            default:
                System.out.println("Volta");
                exibeMenu();
        }
    }
}
