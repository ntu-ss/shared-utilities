package shared.utilities;

/**
 * Response message sent by a server to a client to accept or decline and 
 * authentication request.
 */
public class AuthenticationResponseMessage extends Message {
    
    private final boolean accepted;
    
    /**
     * Constructs an AuthenticationResponseMessage.
     * 
     * @param accepted 
     */
    public AuthenticationResponseMessage(boolean accepted) {
        this.accepted = accepted;
    }
    
    /**
     * Getter for the accepted status.
     * 
     * @return Boolean
     */
    public boolean isAccepted() {
        return accepted;
    }
    
}
