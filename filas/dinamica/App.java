package filas.dinamica;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        Fila fila = new Fila(lista);
        System.out.println("Aeroporto em Fila!");
        int opc;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar Avião");
            System.out.println("2 - Decolar Avião");
            System.out.println("3 - Imprimir Fila");
            System.out.println("0 - Sair");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    scanner = new Scanner(System.in);
                    System.out.print("Companhia aérea: ");
                    String companhia = scanner.nextLine();
                    System.out.print("Prefixo do avião: ");
                    String prefixo = scanner.nextLine();
                    Aviao aviao = new Aviao(companhia, prefixo);
                    if (!fila.chegadaAviao(aviao))
                        System.out.println("Erro ao decolar avião.");
                    else
                        System.out.println("Chegou na pista: " + aviao.getCompanhia() + " | " + aviao.getPrefixo());
                    break;
                case 2:
                    System.out.println("Decolando avião...");
                    Aviao aviaoDecolou = fila.decolagem();
                    System.out.println("Decolou: " + aviaoDecolou.getCompanhia() + " | " + aviaoDecolou.getPrefixo());
                    break;
                case 3:
                    fila.imprimirAvioes();
                    break;
                default:
                    break;
            }
        } while (opc != 0);
        System.out.println("Saindo...");
        scanner.close();
    }
}
