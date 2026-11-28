package pilhas.dinamica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        Pilha pilha = new Pilha(lista);
        System.out.println("Empilhando aviões dinamicamente!");
        int opc;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Empilhar avião");
            System.out.println("2 - Decolar avião do topo");
            System.out.println("3 - Imprimir pilha");
            System.out.println("0 - Sair");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    scanner = new Scanner(System.in);
                    System.out.print("Companhia: ");
                    String companhia = scanner.nextLine();
                    System.out.print("Prefixo: ");
                    String prefixo = scanner.nextLine();
                    Aviao aviao = new Aviao(companhia, prefixo);
                    Nodo nodo = new Nodo(aviao);
                    pilha.push(nodo);
                    System.out.println("Avião empilhado: " + nodo.getAviao().getCompanhia() + " | " + nodo.getAviao().getPrefixo());
                    break;
                case 2:
                    Nodo removido = pilha.pop();
                    if (removido != null)
                        System.out.println("Avião do topo decolou!\nCompanhia: " + removido.getAviao().getCompanhia() + " | Prefixo: " + removido.getAviao().getPrefixo());
                    else
                        System.out.println("Pilha já está vazia!");
                    break;
                case 3:
                    pilha.imprimirLista();
                    break;
                default:
                    break;
            }
        } while (opc != 0);
        System.out.println("Saindo...");
    }
}