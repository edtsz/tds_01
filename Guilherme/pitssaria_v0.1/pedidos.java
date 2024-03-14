public class pedidos {

    private double total;
    private int ID;
    private double taxaEntrega;
    private ItemDoPedido itemDoPedido;
    private String cliente;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido = item;
    }
    public void setCliente(String nome) {
        this.cliente = nome;
    }
    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public double getTotal() {

        return total = this.taxaEntrega + this.itemDoPedido.getValor();
     
    }

    public void imprimir() {
        System.out.println("_____________________________");
        System.out.println("Pitssaria Que Vende Ptissaç: ");
        System.out.println("_____________________________");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("_____________________________");
        System.out.println("Sabor: " + this.itemDoPedido.getSabor());
        System.out.println("Tipo: " + this.itemDoPedido.getTipo());
        System.out.println("Valor: " + this.itemDoPedido.getValor());
        System.out.println("_____________________________");
        System.out.println("Taxa de Entrega: " + this.taxaEntrega);
        System.out.println("_____________________________");
        System.out.println("Total: " + this.getTotal());
        System.out.println("_____________________________");
    }
}