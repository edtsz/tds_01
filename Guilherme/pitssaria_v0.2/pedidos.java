import java.util.ArrayList;

public class pedidos {

    private double total;
    private int ID;
    private double taxaEntrega;
    private String localEntrega = "";
    private ArrayList<ItemDoPedido> itemDoPedido = new ArrayList<ItemDoPedido>();
    private String cliente;

    public void adicionarItemDoPedido(ItemDoPedido item) {
        this.itemDoPedido.add(item);
    }
    public void setCliente(String nome) {
        this.cliente = nome;
    }
    public void setLocalEntrega(String taxaEntrega) {
        if(localEntrega.equalsIgnoreCase("Centro")) {
            return 10;
        }
        else if (localEntrega.equalsIgnoreCase("Periferia")) {
            return 15;
        }
        else if (localEntrega.equalsIgnoreCase("Outro")) {
            return 20;
        }
    }

    public double getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public double getTotal() {
        Double total = this.getLocalEntrega();
        for ( int i=0; i < this.itemDoPedido.size(); i++) {
            total += this.itemDoPedido.get(i).getValor();
        } 
        return total;
    }

    public void imprimir() {
        System.out.println("_____________________________");
        System.out.println("Pitssaria Que Vende Ptissaç: ");
        System.out.println("_____________________________");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("_____________________________");
        for ( int i=0; i < this.itemDoPedido.size(); i++) {
            if (i>0) {
                System.out.println();
            }
            System.out.println("Sabor: " + this.itemDoPedido.get(i).getSabor());
            System.out.println("Tipo:  " + this.itemDoPedido.get(i).getTipo());
            System.out.println("Valor: " + this.itemDoPedido.get(i).getValor());
        }
        System.out.println("_____________________________");
         System.out.println("Local: " + this.setLocalEntrega());
        System.out.println("Taxa de Entrega: " + this.getTaxaEntrega());
        System.out.println("_____________________________");
        System.out.println("Total: " + this.getTotal());
        System.out.println("_____________________________");
    }
}