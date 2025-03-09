package splitwise;

public class Expense {
    private String ExpenseId;
    private double amount;
    private String description;
    private User paidBy;
    private List<Split> splits;

    public Expense(String expenseId, double amount, String description, User paidBy, List<Split> splits) {
        ExpenseId = expenseId;
        this.amount = amount;
        this.description = description;
        this.paidBy = paidBy;
        this.splits = splits;
    }
    public  void addSplit(Split split){
        splits.add(split);
    }

}

