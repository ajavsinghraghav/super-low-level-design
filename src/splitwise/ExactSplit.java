package splitwise;

public class ExactSplit  extends Split{
    private final double amount;

    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;

    }
