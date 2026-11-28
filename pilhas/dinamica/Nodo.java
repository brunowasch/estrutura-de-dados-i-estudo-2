package pilhas.dinamica;

public class Nodo {
    private Aviao aviao;
    private Nodo proximo;

    public Nodo(Aviao aviao) {
        this.aviao = aviao;
        this.proximo = null;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
