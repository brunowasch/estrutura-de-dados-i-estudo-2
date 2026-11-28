package pilhas.dinamica;

public class Pilha {
    private ListaSimplesmenteEncadeada lista;

    public Pilha(ListaSimplesmenteEncadeada lista) {
        this.lista = lista;
    }

    public ListaSimplesmenteEncadeada getLista() {
        return lista;
    }

    public void setLista(ListaSimplesmenteEncadeada lista) {
        this.lista = lista;
    }

    public void push(Nodo nodo) {
        if (lista.getCabeca() == null) 
            lista.setCabeca(nodo);
        else {
            Nodo nodoCabeca = lista.getCabeca();
            lista.setCabeca(nodo);
            nodo.setProximo(nodoCabeca);
        }
    }

    public Nodo pop() {
        if (lista.getCabeca() != null) {
            Nodo proximaCabeca = lista.getCabeca().getProximo();
            Nodo removido = lista.getCabeca();
            lista.setCabeca(proximaCabeca);
            return removido;
        }
        return null;
    }

    public Nodo peek() {
        return lista.getCabeca();
    }

    public void imprimirLista() {
        Nodo nodoAux = lista.getCabeca();
        while (nodoAux != null) {
            System.out.println("Companhia: " + nodoAux.getAviao().getCompanhia() + " | Prefixo: " + nodoAux.getAviao().getPrefixo());
            nodoAux = nodoAux.getProximo();
        }
    }
}
