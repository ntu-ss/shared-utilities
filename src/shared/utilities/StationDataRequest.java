package shared.utilities;

public class StationDataRequest extends Message {
    
    private final String id;

    public StationDataRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
