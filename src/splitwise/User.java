package splitwise;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class User {
    private String UserId;
    private String UserName;
    private String email;
    private Map<String,Double> balance;

    public User(String userId, String userName, String email, Map<String, Double> balance) {
        UserId = userId;
        UserName = userName;
        this.email = email;
        this.balance = new ConcurrentHashMap<>();
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return email;
    }

    public Map<String, Double> getBalance() {
        return balance;
    }
}
