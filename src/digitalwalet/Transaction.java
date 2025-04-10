package digitalwalet;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;

public class Transaction {
    private int  transactionId;
    private Account sourceAccount;
    private Account destinationAccount;
    private BigDecimal amount;
    private Currency currency;
    private LocalDateTime localDateTime;

    public Transaction(int transactionId, Account sourceAccount, Account destinationAccount, BigDecimal amount, Currency currency, LocalDateTime localDateTime) {
        this.transactionId = transactionId;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.currency = currency;
        this.localDateTime = localDateTime;


    }

    public int getTransactionId() {
        return transactionId;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public BigDecimal getAmounts() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
