package linkdin;

import java.awt.color.ProfileDataException;
import java.util.List;


public class User {
    private String USerId;
    private String name;
    private String email;
    private  String password;
    private Profile profile;
    private List<Connection> list;
    private List <Message>inbox;
    private List<Message>sentMessage;

    public User(String USerId, String name, String email, String password, Profile profile, List<Connection> list, List<Message> inbox, List<Message> sentMessage) {
        this.USerId = USerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.list = list;
        this.inbox = inbox;
        this.sentMessage = sentMessage;
    }

    public String getUSerId() {
        return USerId;
    }

    public void setUSerId(String USerId) {
        this.USerId = USerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Connection> getList() {
        return list;
    }

    public void setList(List<Connection> list) {
        this.list = list;
    }

    public List<Message> getInbox() {
        return inbox;
    }

    public void setInbox(List<Message> inbox) {
        this.inbox = inbox;
    }

    public List<Message> getSentMessage() {
        return sentMessage;
    }

    public void setSentMessage(List<Message> sentMessage) {
        this.sentMessage = sentMessage;
    }
}
