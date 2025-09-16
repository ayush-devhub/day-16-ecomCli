package demo.ayush.ecomcli.model;

import demo.ayush.ecomcli.model.enums.UserRole;
import demo.ayush.ecomcli.utility.ValidationUtils;

/**
 * Represents a user in the e-commerce application.
 * User can update password, username and role, hence the setters.
 */
public class User {
    private final int id;
    private String username;
    private String passwordHash;
    private UserRole role;

    // TODO: make system assign userID (5 digit)
    public User(int id, String username, String passwordHash, UserRole role) {
        if (!ValidationUtils.isPositive(id)) {
            throw new IllegalArgumentException("ID must be <= 0: " + id);
        }
        if (!ValidationUtils.isNotBlank(username)) {
            throw new IllegalArgumentException("Username can't be blank.");
        }
        if (!ValidationUtils.isNotBlank(passwordHash)) {
            throw new IllegalArgumentException("PasswordHash can't be blank.");
        }
        if (role == null) {
            throw new IllegalArgumentException("Role can't be null.");
        }
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (!ValidationUtils.isNotBlank(username)) {
            throw new IllegalArgumentException("UserName can't be blank.");
        }
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        if (!ValidationUtils.isNotBlank(passwordHash)) {
            throw new IllegalArgumentException("PasswordHash can't be blank.");
        }
        this.passwordHash = passwordHash;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        if (role == null) {
            throw new IllegalArgumentException("Role can't be null.");
        }
        this.role = role;
    }
}
