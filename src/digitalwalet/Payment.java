package digitalwalet;

import java.math.BigDecimal;
import java.util.Currency;

public class Payment {
    protected String id;
    protected User user;

    public Payment(String id, User user) {
        this.id = id;
        this.user = user;
    }
    public abstract  boolean processPayment(BigDecimal amount, Currency currency);

    public String getId(){
        return id;

    }
    public User getUser(){
        return  user;
    }



}
