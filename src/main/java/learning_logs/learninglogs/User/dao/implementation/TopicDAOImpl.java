package learning_logs.learninglogs.User.dao.implementation;

import learning_logs.learninglogs.User.dao.interfaces.TopicDAOInterface;
import learning_logs.learninglogs.User.model.Topic;
import util.DBConnection;
import util.query.Queries;
import util.query.UserQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicDAOImpl implements TopicDAOInterface {

    private final Connection conn;
    public TopicDAOImpl() throws SQLException, ClassNotFoundException {
        this.conn= DBConnection.getConnection();
    }

    @Override
    public List<Topic> getTopicsByUser(int userid) throws SQLException {
        // try bit resources
       try(PreparedStatement ps = conn.prepareStatement(UserQuery.GET_ALL_TOPICS);){
           ps.setInt(1, userid);
           // list banauney topic type ko
           List<Topic> topics = new ArrayList<>();
           try(ResultSet rs = ps.executeQuery();){
               while (rs.next()){
                   Topic topic = new Topic();
                   topic.setId(rs.getInt("topicID"));
                   topic.setTitle(rs.getString("title"));
                   topic.setCreated_at(rs.getTimestamp("created_at"));
                   topic.setUpdated_at(rs.getTimestamp("updated_at"));
                   topics.add(topic);

               }
           }
        return topics;
       }
    }
}


