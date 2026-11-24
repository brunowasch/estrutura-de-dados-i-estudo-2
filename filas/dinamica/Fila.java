package filas.dinamica;

public class Fila {
    private int inicio;
    private int fim;
    private ListaSimplesmenteEncadeada lista;

    public Fila(ListaSimplesmenteEncadeada lista) {
        inicio = 0;
        fim = 0;
        this.lista = lista;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public boolean chegadaAviao(Aviao aviao) {
        Nodo nodoAviao = new Nodo(aviao);
        if (lista.getCabeca() == null) {
            lista.setCabeca(nodoAviao);
            return true;
        } else if (lista.getCabeca() != null) {
            Nodo nodoAux = lista.getCabeca();
            while (nodoAux.getProximo() != null) 
               nodoAux = nodoAux.getProximo();
            nodoAux.setProximo(nodoAviao);
            return true;
        }

        return false;
    }

    public Aviao decolagem() {
        if (lista.getCabeca() != null) {
            Nodo nodoAux = lista.getCabeca();
            lista.setCabeca(nodoAux.getProximo());
            Aviao aviao = nodoAux.getAviao();
            return aviao;
        } 
        return null;
    }

    public void imprimirAvioes() {
        if (lista.getCabeca() != null) {
            Nodo nodoAux = lista.getCabeca();
            while (nodoAux != null) {
                Aviao aviao = nodoAux.getAviao();
                System.out.println("Companhia: " + aviao.getCompanhia() + "| Prefixo: " + aviao.getPrefixo());
                nodoAux = nodoAux.getProximo();
            }
        }
    }
}
