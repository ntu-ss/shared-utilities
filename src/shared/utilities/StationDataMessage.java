package shared.utilities;

public class StationDataMessage extends Message {
    private final String position;
    private final Integer temperature;
    private final Integer humidity;

    public StationDataMessage(String position, Integer temperature, Integer humidity) {
        this.position = position;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getPosition() {
        return position;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }
}
