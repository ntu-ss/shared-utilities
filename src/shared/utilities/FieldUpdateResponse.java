package shared.utilities;

public class FieldUpdateResponse extends Message {
    
    private final String crop;
    private final int area;
    private final String[] stations;
    
    public FieldUpdateResponse(String crop, int area, String[] stations) {
        this.crop = crop;
        this.area = area;
        this.stations = stations;
    }
    
    public String getCrop() {
        return crop;
    }
    
    public int getArea() {
        return area;
    }
    
    public String[] getStations() {
        return stations;
    }
}
