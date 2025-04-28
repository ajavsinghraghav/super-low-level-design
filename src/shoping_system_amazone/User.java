package shoping_system_amazone;

import java.util.List;

public class User {
    private  String id;
    private   String name;
    private String emil;
    private String password;
    private List<Order> orders;


    public User(String id, String name, String emil, String password, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.emil = emil;
        this.password = password;
        this.orders = orders;
    }

    public  void addOrder(Order order){
        orders.add(order);
    }

    public String getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmil() {
        return emil;
    }

    public String getPassword() {
        return password;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
