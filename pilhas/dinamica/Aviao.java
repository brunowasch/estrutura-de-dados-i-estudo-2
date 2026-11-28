package pilhas.dinamica;

public class Aviao {
    private String companhia;
    private String prefixo;

    public Aviao(String companhia, String prefixo) {
        this.companhia = companhia;
        this.prefixo = prefixo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
}
