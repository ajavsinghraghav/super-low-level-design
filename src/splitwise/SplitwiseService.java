package splitwise;

import java.lang.ref.PhantomReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SplitwiseService {
    private static SplitwiseService instance;
    private Map<String, User>users;
    private Map<String, Group>groups;

   // private static final String TRANSACTION_ID_PREFIX = "TXN";
   // private static final AtomicInteger transactionCounter = new AtomicInteger(0);
    private static  String TRANSACTION_ID_PREFIX="TXN";
    private static AtomicInteger transactionCounter=new AtomicInteger(0);

  private SplitwiseService(){
      users=new ConcurrentHashMap<>();
      groups=new ConcurrentHashMap<>();


  }
  public static  synchronized  SplitwiseService getInstance(){
      if(instance==null){
          instance=new SplitwiseService();
      }
      return instance;
  }

    public  void addGroup(Group group){
      groups.put(group.getGroupId(),group);

//    public void addExpense(String groupId, Expense expense) {
//        Group group = groups.get(groupId);
//        if (group != null) {
//            group.addExpense(expense);
//            splitExpense(expense);
//            updateBalances(expense);

        public void addExpense(String groupId,,Expense expense){
            Group group1=groups.get(groupId);
            if(group ! =null){
                group.addExpense(expense);
                splitExpense(expense);
                updateBalace(expense);

            }


        }
        public void addExpense(String groupId, Expense expense) {
            Group group = groups.get(groupId);
            if (group != null) {
                group.addExpense(expense);
                splitExpense(expense);
                updateBalances(expense);
            }
        }
        private void updateBalances(Expense expense) {
            for (Split split : expense.getSplits()) {
                User paidBy = expense.getPaidBy();
                User user = split.getUser();
                double amount = split.getAmount();

                if (!paidBy.equals(user)) {
                    updateBalance(paidBy, user, amount);
                    updateBalance(user, paidBy, -amount);
                }
            }
        }

        private void updateBalance(User user1, User user2, double amount) {
            String key = getBalanceKey(user1, user2);
            user1.getBalances().put(key, user1.getBalances().getOrDefault(key, 0.0) + amount);
        }

        private String getBalanceKey(User user1, User user2) {
            return user1.getId() + ":" + user2.getId();
        }

        public void settleBalance(String userId1, String userId2) {
            User user1 = users.get(userId1);
            User user2 = users.get(userId2);

            if (user1 != null && user2 != null) {
                String key = getBalanceKey(user1, user2);
                double balance = user1.getBalances().getOrDefault(key, 0.0);

                if (balance > 0) {
                    createTransaction(user1, user2, balance);
                    user1.getBalances().put(key, 0.0);
                    user2.getBalances().put(getBalanceKey(user2, user1), 0.0);
                } else if (balance < 0) {
                    createTransaction(user2, user1, Math.abs(balance));
                    user1.getBalances().put(key, 0.0);
                    user2.getBalances().put(getBalanceKey(user2, user1), 0.0);
                }
            }
        }

        private void createTransaction(User sender, User receiver, double amount) {
            String transactionId = generateTransactionId();
            Transaction transaction = new Transaction(transactionId, sender, receiver, amount);
            // Process the transaction
            // ...
        }

        private String generateTransactionId() {
            int transactionNumber = transactionCounter.incrementAndGet();
            return TRANSACTION_ID_PREFIX + String.format("%06d", transactionNumber);
        }
    }


    public void addUser(User user1) {
    }
}

}
