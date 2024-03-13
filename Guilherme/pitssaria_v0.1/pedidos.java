import java.util.List;

public class pedidos {

    private double total;
    private int ID;
    private double tx_entrega;
    private List<ItemDoPedido> ItemDoPedido;
    private String Cliente;
    private String nome = "";

    public void adicionarItemDoPedido(ItemDoPedido  item) {

        this.itensDoPedido.add(item);
    }
    public void setCliente(String cliente) {
        this.cliente = nome;
    }
    public void settx_entrega(double tx_entrega) {
        this.tx_entrega = tx_entrega;
    }
}