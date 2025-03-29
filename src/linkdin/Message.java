package linkdin;

public class Message {
    private String id;
    private User sender;
    private User receiver;
    private String content;
    private TimeStamp timeStamp;

    public Message(String id, User sender, User receiver, String content, TimeStamp timeStamp) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timeStamp = timeStamp;
    }
}
