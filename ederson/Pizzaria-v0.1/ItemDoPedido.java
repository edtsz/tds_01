public class ItemDoPedido {
    private String tipo;
    private String sabor;
    private double valor;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }
    
    public String getSabor() {
        return this.sabor;
    }
}
