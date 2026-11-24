package listas.simplesmenteEncadeada.ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        int opc, numero;
        System.out.println("Lista encadeada para números inteiros!");
        do {
            System.out.println("Cadastrar números positivos!");
            System.out.println("1 - Adicionar no Início");
            System.out.println("2 - Adicionar no fim");
            System.out.println("3 - Remover número");
            System.out.println("4 - Imprimir lista");
            System.out.println("0 - Sair");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Digite o número a ser adicionado no início: ");
                    numero = scanner.nextInt();
                    Nodo nodoInicio = new Nodo(numero);
                    lista.adicionarNoInicio(nodoInicio);
                    break;
                case 2:
                    System.out.print("Digite o número a ser adicionado no fim: ");
                    numero = scanner.nextInt();
                    Nodo nodoFim = new Nodo(numero);
                    lista.adicionarNoInicio(nodoFim);
                    break;
                case 3:
                    System.out.print("Digite o número a ser removido da lista: ");
                    numero = scanner.nextInt();
                    Nodo nodoRemover = new Nodo(numero);
                    lista.removerNodo(nodoRemover);
                    break;
                case 4:
                    System.out.println("========= LISTA =========");
                    lista.imprimirLista();
                    break;
                default:
                    break;
            }
        } while (opc != 0);
        scanner.close();
        System.out.println("Saindo...");
    }
}
