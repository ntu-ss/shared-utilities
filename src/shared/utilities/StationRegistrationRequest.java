package shared.utilities;

public class StationRegistrationRequest extends Message {
    
    private final String id;

    public StationRegistrationRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
