package shared.utilities;

public class ClientAuthenticationResponse extends Message {
    
    private final boolean accepted;

    public ClientAuthenticationResponse(boolean accepted) {
        this.accepted = accepted;
    }
    
    public boolean isAccepted() {
        return accepted;
    }
    
}
