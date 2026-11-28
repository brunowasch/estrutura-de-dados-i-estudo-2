package listas.duplamenteEncadeada.ex1;

public class ListaDuplamenteEncadeada {
    private Nodo cabeca;
    private Nodo cauda;

    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda = null;
    }

    public Nodo getCabeca() {
        return cabeca;
    }

    public void setCabeca(Nodo cabeca) {
        this.cabeca = cabeca;
    }

    public Nodo getCauda() {
        return cauda;
    }

    public void setCauda(Nodo cauda) {
        this.cauda = cauda;
    }

    public void adicionarNoInicio(int numero) {
        Nodo nodo = new Nodo(numero);
        if (this.getCabeca() == null)
            this.setCauda(nodo);
        else 
            this.getCabeca().setAnterior(nodo);
        nodo.setProximo(this.getCabeca());
        nodo.setAnterior(null);
        this.setCabeca(nodo);
    }

    public void adicionarNoFim(int numero) {
        Nodo nodo = new Nodo(numero);
        if (this.getCauda() == null)
            this.setCabeca(nodo);
        else 
            this.getCauda().setProximo(nodo);
        nodo.setProximo(null);
        nodo.setAnterior(this.getCauda());
        this.setCauda(nodo);
    }

    public boolean removerPrimeiro() {
        if (this.getCabeca() != null) {
            Nodo novaCabeca = this.getCabeca().getProximo();
            novaCabeca.setAnterior(null);
            this.setCabeca(novaCabeca);
            return true;
        }
        return false;
    }

    public boolean removerUltimo() {
        if (this.getCauda() != null) {
            Nodo novaCauda = this.getCauda().getAnterior();
            novaCauda.setProximo(null);
            this.setCauda(novaCauda);
            return true;
        }
        return false;
    }

    public void removerDesejado(int numero) {
        Nodo numeroAux = this.getCabeca();
        Nodo numeroAuxAnterior = null;
        while (numeroAux != null && numeroAux.getNumero() != numero) {
            numeroAuxAnterior = numeroAux;
            numeroAux = numeroAux.getProximo();
        }

        if (numeroAuxAnterior == null) {
            this.setCabeca(numeroAux.getProximo());
            numeroAux.setAnterior(null);
            return;
        }

        if (numeroAux != null) {
            numeroAuxAnterior.setProximo(numeroAux.getProximo());
            if (numeroAux.getProximo() != null)
                numeroAux.getProximo().setAnterior(numeroAuxAnterior);
        }
    }

    public void removerTodos() {
        this.setCabeca(null);
        this.setCauda(null);
    }

    
}
