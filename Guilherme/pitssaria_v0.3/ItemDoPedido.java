public class ItemDoPedido {

    private int n_pedido;
    private double valor;
    private String sabor;
    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return this.sabor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        if (this.getTipo().equalsIgnoreCase("tradicional")) {
            return 40.0;
        }
        else if (this.getTipo().equalsIgnoreCase("especial")) {
            return 50.0;
        }
        else if (this.getTipo().equalsIgnoreCase("mista")) {
            return 60.0;
        }
        return 0.0;
    }
}