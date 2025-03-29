package linkdin;

import java.security.Timestamp;
import java.util.List;

public class JobPosting {
    private String id;
    private String title;
    private String description;
    private List<String> requirnment;
    private String location;
    private Timestamp postDate;

    public JobPosting(String id, String title, String description, List<String> requirnment, String location, Timestamp postDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.requirnment = requirnment;
        this.location = location;
        this.postDate = postDate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getRequirnment() {
        return requirnment;
    }

    public String getLocation() {
        return location;
    }

    public Timestamp getPostDate() {
        return postDate;
    }
}
