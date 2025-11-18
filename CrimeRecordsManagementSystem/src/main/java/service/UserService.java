package service;

import dao.UserDAO;
import model.User;
import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void registerUser(String username, String password, String role) {
        User existing = userDAO.findByUsername(username);
        if (existing == null) {
            User user = new User(username, password, role);
            userDAO.save(user);
            System.out.println(" User registered successfully.");
        } else {
            System.out.println(" Username already exists. Try another name.");
        }
    }

    public User login(String username, String password) {
        User user = userDAO.login(username, password);
        if (user != null) {
            System.out.println(" Login successful. Welcome " + user.getUsername() + "!");
        } else {
            System.out.println(" Invalid username or password.");
        }
        return user;
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }
}
