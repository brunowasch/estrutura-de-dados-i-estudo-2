package filas.estatica;

public class Fila {
    private int inicio;
    private int fim;
    private Aviao fila[];

    public Fila(int tamanho) {
        this.inicio = 0;
        this.fim = 0;
        this.fila = new Aviao[tamanho];
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

    public Aviao[] getFila() {
        return fila;
    }

    public void setFila(Aviao[] fila) {
        this.fila = fila;
    }

    public boolean filaCheia() {
        return fim >= fila.length;
    }

    public boolean filaVazia() {
        return inicio == 0 && fim == 0;
    }

    public boolean enfileirar(Aviao aviao) {
        if (inicio >= 0 && !filaCheia()) {
            fila[fim] = aviao;
            fim++;
            return true;
        }
        return false;
    }

    public Aviao desenfileirar() {
        if (fim >= 0 && !filaVazia()) {
            Aviao removido = fila[inicio];
            for(int i = 0; i < fim - 1; i++)
                fila[i] = fila[i+1];
            fim--;
            return removido;
        }

        return null;
    }

    public void imprimirAvioes() {
        for(int i = inicio; i < fim; i++)
            System.out.println("Companhia: " + fila[i].getCompanhia() + " | Prefixo: " + fila[i].getPrefixo());
    }
}
