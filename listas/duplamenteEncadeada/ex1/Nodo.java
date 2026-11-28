package listas.duplamenteEncadeada.ex1;

public class Nodo {
    private int numero;
    private Nodo proximo;
    private Nodo anterior;

    public Nodo(int numero) {
        this.numero = numero;
        this.proximo = null;
        this.anterior = null;
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
    public Nodo getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    
}
