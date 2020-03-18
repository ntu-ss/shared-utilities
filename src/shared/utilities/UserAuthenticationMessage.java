package shared.utilities;

/**
 * Message sent to the Server from a UserClient, containing username and
 * password for authentication.
 */
public class UserAuthenticationMessage extends Message {
    private final String username;
    private final String password;
    
    /**
     * Constructs an instance of AuthenticationMessage with a username and
     * password.
     * 
     * @param username
     * @param password 
     */
    public UserAuthenticationMessage(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    /**
     * Getter for username.
     * 
     * @return String 
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Getter for password.
     * 
     * @return String 
     */
    public String getPassword() {
        return password;
    }
}
