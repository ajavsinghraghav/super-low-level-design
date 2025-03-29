package linkdin;

import java.util.List;

public class Profile {
    private String profilePicture;
    private String headLine;
    private String summery;
    private List<Education> educationList;
    private List<Experince>experinceList;
    private List<Skills>skillsList;

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public List<Experince> getExperinceList() {
        return experinceList;
    }

    public void setExperinceList(List<Experince> experinceList) {
        this.experinceList = experinceList;
    }

    public List<Skills> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<Skills> skillsList) {
        this.skillsList = skillsList;
    }
}
