package learning_logs.learninglogs.User.model;

    import java.sql.Timestamp;
public class Topic {
    private int topicId;
    private String title;
    private Timestamp created_at;
    private Timestamp updated_at;
    private int userid;

    // parameterised constructor
    public Topic(int topicId, String title, Timestamp created_at, Timestamp updated_at, int userid) {
        this.topicId = topicId;
        this.title = title;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.userid = userid;
    }


    // default constructor
    public Topic() {
    }


    // getter and setter method
    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setId(int topicID) {

    }
}
