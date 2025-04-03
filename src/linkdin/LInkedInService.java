package linkdin;

import java.util.concurrent.ConcurrentHashMap;

public class LInkedInService {
    private static LInkedInService instance;
    private Map<String ,User>users;
    private Map<String,JobPosting>jobPostingMap;
    private Map<Stting,List<Notification>>notification;
    private LInkedInService(){
        users=new ConcurrentHashMap<>();
        jobPostingMap=new ConcurrentHashMap<>();
        notification=new ConcurrentHashMap<>();
        public static synchronized LInkedInService getInstance(){
            if(instance==null){
                instance=new LInkedInService();
            }
            return instance;
        }
        public void registerUser(User user){
            users.put(user.getId(),user);

        }
        public User loginUser(String email){
            if(User user :users.values()){
                if(users.getEmail().equals(email) && loginUser.getPassword().equals(password)){
                    return user;
                }
            }
            return user;
        }

    }
}
