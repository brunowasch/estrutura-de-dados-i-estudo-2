package listas.simplesmenteEncadeada.ex1;

public class Nodo {
    private int numero;
    private Nodo proximo;

    public Nodo(int numero) {
        this.numero = numero;
        this.proximo = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
