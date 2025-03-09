package splitwise;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Group {
    private String groupId;
    private String GroupName;
    private List<User> users;
    private List<Expense>expenses;

    public Group(String groupId, String groupName, List<User> users, List<Expense> expenses) {
        this.groupId = groupId;
        GroupName = groupName;
        this.users = new CopyOnWriteArrayList<>();
        this.expenses = new CopyOnWriteArrayList<>();
    }
    public void adduser(User user){
        users.add(user);

    }
    public void addExpense(Expense expense){
        expenses.add(expense);
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void addMember(User user1) {
    }
}
