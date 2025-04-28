package shoping_system_amazone;

import java.util.List;

public class Order {
    private  String id;
    private User user;
    private List<OrderItem> items;
    private double toatalAmount;
    private OrderStatus status;

    public Order(String id, User user, List<OrderItem> items, double toatalAmount, OrderStatus status) {
        this.id = id;
        this.user = user;
        this.items = items;
        this.toatalAmount = calculateToatalAmount;
        this.status = OrderStatus.PENDING;
    }
    private double calculateToatalAmount(){
        return items.stream().mapToDouble(item-> item.getproduct().getprice()*item.getQuantity()).sum();
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getToatalAmount() {
        return toatalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
