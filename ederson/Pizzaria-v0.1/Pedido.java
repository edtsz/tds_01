public class Pedido {
    private ItemDoPedido itemDoPedido;
    private String cliente;
    private double taxaEntrega;

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
        return this.taxaEntrega + this.itemDoPedido.getValor();
    }

    public void imprimir() {
        System.out.println("--------------------------------------------");
        System.out.println("                  PIZZARIA                  ");
        System.out.println("                 QuasePronto                ");
        System.out.println("--------------------------------------------");
        System.out.println(" Cliente     : " + this.cliente);
        System.out.println("--------------------------------------------");
        System.out.println(" Tipo        : " + this.itemDoPedido.getTipo());
        System.out.println(" Sabor       : " + this.itemDoPedido.getSabor());
        System.out.println(" Valor       : " + this.itemDoPedido.getValor());
        System.out.println("--------------------------------------------");
        System.out.println(" Tx. Entrega : " + this.taxaEntrega);
        System.out.println("--------------------------------------------");
        System.out.println(" Total       : " + this.getTotal());
        System.out.println("--------------------------------------------");
    }
}
