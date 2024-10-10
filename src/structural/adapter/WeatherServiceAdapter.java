package structural.adapter;

public interface WeatherServiceAdapter {
    TemperatureData getTemperature(double longitude, double latitude);
}
