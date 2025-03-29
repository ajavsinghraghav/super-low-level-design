package linkdin;

public class Notification {
    private String id;
    private User user;
    private NotificationTye notificationTye;
    private String content;
    private TimeStamp timeStamp;

    public Notification(String id, User user, NotificationTye notificationTye, String content, TimeStamp timeStamp) {
        this.id = id;
        this.user = user;
        this.notificationTye = notificationTye;
        this.content = content;
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public NotificationTye getNotificationTye() {
        return notificationTye;
    }

    public String getContent() {
        return content;
    }

    public TimeStamp getTimeStamp() {
        return timeStamp;
    }
}
