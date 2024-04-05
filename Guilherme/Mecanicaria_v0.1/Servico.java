import java.time.LocalDateTime;

public class Servico {
    private double valor;
    private double tempoCLi;
    private double tempoMec;
    private String descricao;
    private String problemasMec;
    private LocalDateTime data = LocalDateTime.now();

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setTempoCLi (double tempoCLi) {
        this.tempoCLi = tempoCLi;
    }
    public double getTempoCli() {
        return this.tempoCLi;
    }

    public void setTempoMec (double tempoMec) {
        this.tempoMec = tempoMec;
    }
    public double getTempoMec() {
        return this.tempoMec;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return this.valor;
    }

    public void setProblemasMec(String problemasMec ) {
        this.problemasMec = problemasMec;
    }
    public String getProblemasMec() {
        return this.problemasMec;
    }
    
}