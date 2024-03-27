import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemDoPedido> itemDoPedido = new ArrayList<ItemDoPedido>();
    private String cliente;
    private Double taxaEntrega;
    private Double total = .0;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido.add(item);
        this.addTotal(item.getValor());
    }
    public ItemDoPedido getItemDoPedido(int index) {
        return this.itemDoPedido.get(index);
    }

    public void addTotal(Double valor) {
        this.total += valor;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setCliente(String nome) {
        this.cliente = nome;
    }
    public String getCliente() {
        return this.cliente;
    }

    public void setTaxaEntrega(Double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
        this.addTotal(taxaEntrega);
    }
    public Double getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void imprimir() {
        System.out.println("--------------------------------------------");
        System.out.println("                  PIZZARIA                  ");
        System.out.println("                 QuasePronto                ");
        System.out.println("--------------------------------------------");
        System.out.println(" Cliente     : " + this.cliente);
        System.out.println("--------------------------------------------");
        for (int i =0; i < this.itemDoPedido.size(); i++) {
            if (i > 0 ) {
                System.out.println();
            }
            System.out.println(" Tipo        : " + this.getItemDoPedido(i).getTipo());
            System.out.println(" Sabor       : " + this.getItemDoPedido(i).getSabor());
            System.out.println(" Valor       : " + this.getItemDoPedido(i).getValor());
        }
        System.out.println("--------------------------------------------");
        System.out.println(" Tx. Entrega : " + this.getTaxaEntrega());
        System.out.println("--------------------------------------------");
        System.out.println(" Total       : " + this.getTotal());
        System.out.println("--------------------------------------------");
    }
}
