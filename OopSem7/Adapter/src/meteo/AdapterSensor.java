package meteo;

import java.io.SequenceInputStream;
import java.time.LocalDateTime;

public class AdapterSensor implements MeteoSensor{

    private SensorTemperature sensorTemperature;

    public AdapterSensor(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }
    
    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime time = LocalDateTime.of(sensorTemperature.year(), 1, 1, 0, 0);
        time = time.plusDays(sensorTemperature.day() - 1);
        time = time.plusSeconds(sensorTemperature.second());
        return time;
    }
}
