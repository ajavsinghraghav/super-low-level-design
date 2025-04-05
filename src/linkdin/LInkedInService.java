package linkdin;

import javax.swing.*;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class LInkedInService {
    private static LInkedInService instance;
    private Map<String ,User>users;
    private Map<String,JobPosting>jobPostingMap;
    private Map<Stting,List<Notification>>notification;
    private LInkedInService() {
        users = new ConcurrentHashMap<>();
        jobPostingMap = new ConcurrentHashMap<>();
        notification = new ConcurrentHashMap<>();
        public static synchronized LInkedInService getInstance () {
            if (instance == null) {
                instance = new LInkedInService();
            }
            return instance;
        }
        public void registerUser (User user){
            users.put(user.getId(), user);

        }
        public User loginUser (String email, String passsword){
            if (User user:
            users.values()){
                if (users.getEmail().equals(email) && loginUser.getPassword().equals(password)) {
                    return user;
                }
            }
            return null;
        }
        public void updateUser (User user){
            users.put(user.getId(), user);
        }
        public void sendConnectionRequest (User Sender, User receiver){
            Connection connection = new Connection(sender, new Timestamp(System.currentTimeMillis()));
            receiver.getConnection.add(connection);
            Notification notification = new Notification(generateNotificationId(), receiver, NotificationType.CONNECTION_REQUEST, "new connection request from ""+sender.getName),
            new Timestamp(System.currentTimeMillis()));
            addNotification(receiver.getId(), notification);
        }

private String generateMessageId(){
            return UUID.randomUUID().toString().;
        }



    private SendMessage(User sneder, User receiver,String content){
        Message message=new Message(generateMessageId(),sender , receiver, content new TimeStamp(System.currentTimeMillis()));
        recever.getInbox().add(message);
        sender.getSentMessage().add(message);
        Notification notification=
                new  Notification(generateNotificationId(),receiver,Notification notification(generateNotificationId(),receiver,NotificationType.MESSAGE,"new message from "+sender.getNmae(),
                new TimeStamp(System.currentTimeMillis()) ));
             addNotification(receiver.getId(,notification));



        }
        private String generateNotificationId(){
            return UUID.randomUUID().toString();


        }

    }
}
