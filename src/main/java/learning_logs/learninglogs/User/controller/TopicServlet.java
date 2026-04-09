package learning_logs.learninglogs.User.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import learning_logs.learninglogs.User.dao.implementation.TopicDAOImpl;
import learning_logs.learninglogs.User.model.Topic;
import learning_logs.learninglogs.User.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "topic", value = "/topic")
public class TopicServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("loggedInUser");
        int user_id = user.getId();

        TopicDAOImpl topicDAO = null;

        try {
            topicDAO = new TopicDAOImpl();
            List<Topic> topics = topicDAO.getTopicsByUser(user_id);
            req.setAttribute("topics", topics);
            req.getRequestDispatcher("pages/home.jsp").forward(req, res);

        } catch (SQLException | ServletException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}