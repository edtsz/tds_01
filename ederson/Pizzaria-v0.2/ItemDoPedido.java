public class ItemDoPedido {
    private String tipo;
    private String sabor;
    private Double valor;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getValor() {
        return this.valor;
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return this.sabor;
    }
}
