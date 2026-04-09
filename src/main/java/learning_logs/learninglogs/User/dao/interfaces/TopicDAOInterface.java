package learning_logs.learninglogs.User.dao.interfaces;
import learning_logs.learninglogs.User.model.Topic;

import java.sql.SQLException;
import java.util.List;

public interface TopicDAOInterface {
    List<Topic> getTopicsByUser(int userid) throws SQLException;
}
