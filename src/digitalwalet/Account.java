package digitalwalet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Account {
    private String accountId;
    private User user;
    private double accoountNumber;
    private Currency currency;
    private double  balance;

    private List<Transaction> transactionList;

    public Account(String accountId, User user, double accoountNumber, Currency currency, double balance, List<Transaction> transactionList) {
        this.accountId = accountId;
        this.user = user;
        this.accoountNumber = accoountNumber;
        this.currency = currency;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public synchronized  void deposit(Double amount){
        balance =balance.add(amount);
    }
    public synchronized  void withdraw(BigDecimal amount){

        if(balance.compareTo(amount)>=0){
            balance=balance.subtract(amount);
        }else{
            throw new InsufficientFundException("insufficient fund in the account");
        }
    }

    public synchronized  void addTransaction(Transaction transaction){
        transaction.add(transaction);
    }

    public String getAccountId() {
        return accountId;
    }

    public User getUser() {
        return user;
    }

    public double getAccoountNumber() {
        return accoountNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }
}
