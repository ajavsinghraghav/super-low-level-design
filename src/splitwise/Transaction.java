package splitwise;

public class Transaction {
    private String transactionId;
    private String sender;
    private String recevier;
    private double amount;

    public Transaction(String transactionId, String sender, String recevier, double amount) {
        this.transactionId = transactionId;
        this.sender = sender;
        this.recevier = recevier;
        this.amount = amount;
    }
}
