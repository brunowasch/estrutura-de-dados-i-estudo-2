package listas.simplesmenteEncadeada.ex1;

public class ListaSimplesmenteEncadeada {
    private Nodo cabeca;

    public ListaSimplesmenteEncadeada() {
        this.cabeca = null;
    }

    public Nodo getCabeca() {
        return cabeca;
    }

    public void setCabeca(Nodo cabeca) {
        this.cabeca = cabeca;
    }

    public void adicionarNoInicio(Nodo nodo) {
        nodo.setProximo(this.getCabeca());
        setCabeca(nodo);
    }

    public void adicionarNoFim(Nodo nodo) {
        if (this.cabeca != null) {
            Nodo nodoAux = getCabeca();
            while (nodoAux.getProximo() != null) 
                nodoAux = nodoAux.getProximo();
            nodoAux.setProximo(nodo);
        } else {
            nodo.setProximo(this.getCabeca());
            setCabeca(nodo);
        }
    }

    public void removerNodo(Nodo nodo) {
        if (this.cabeca != null) {
            Nodo nodoAux = getCabeca();
            if (nodoAux.getNumero() != nodo.getNumero()) {
                while (nodoAux != null && nodoAux.getProximo() != nodo) 
                    nodoAux = nodoAux.getProximo();
                if (nodoAux == null) 
                    System.out.println("Nó não encontrado na lista.");
                else   
                    nodoAux.setProximo(nodo.getProximo());
            } else
                setCabeca(nodoAux.getProximo());
        }
    }

    public void imprimirLista() {
        Nodo nodoAux = getCabeca();
        while (nodoAux != null) {
            if (nodoAux.getProximo() != null)
                System.out.print(nodoAux.getNumero() + " -> ");
            else
                System.out.println(nodoAux.getNumero());
            nodoAux = nodoAux.getProximo();
        }
    }
}