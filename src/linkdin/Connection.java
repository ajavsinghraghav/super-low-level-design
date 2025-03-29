package linkdin;

public class Connection {
    private User user;
    private TimeStamp connectionDate;

    public Connection(User user, TimeStamp connectionDate) {
        this.user = user;
        this.connectionDate = connectionDate;
    }

    public User getUser() {
        return user;
    }

    public TimeStamp getConnectionDate() {
        return connectionDate;
    }
}

