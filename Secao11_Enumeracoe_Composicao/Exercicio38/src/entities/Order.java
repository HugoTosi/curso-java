package entities;
import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> list = new ArrayList<>();

    private Client client;
    private OrderItem orderItem;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getList() {
        return list;
    }

    public void addItem(OrderItem item){
        list.add(item);
    }
    public void removeItem(OrderItem item){
        list.remove(item);
    }
    public Double total(){
        double total = 0;
        for(OrderItem s : list){
            total += s.subTotal();
        }
        return total;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("ORDER MOMENT: " + sdf.format(moment) + "\n");
        sb.append("ORDER STATUS: " + status + "\n");
        sb.append("Client: " + client.getName() +" "+sdf2.format(client.getBirthDate()) + " - " +client.getEmail());
        sb.append("\nOrder Items: \n");
        double total = 0;
        for (OrderItem s : list){
            sb.append(s.getProduct().getName()+" "+ String.format("$%.2f", s.getProduct().getPrice()) +" "+
                    "Quantity: " + s.getQuantity()+", SUBTOTAL: $"+ String.format("%.2f", s.subTotal()) + "\n");

            total +=  s.subTotal();
        }
        sb.append("TOTAL PRICE: $" + total);
        return sb.toString();


    }
}
