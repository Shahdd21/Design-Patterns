package structural.adapter;

public class LegacyWeatherService {
    private ThirdPartyWeatherService weatherAPI;

    public LegacyWeatherService(ThirdPartyWeatherService weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public String getTemperature(String city, String country){
        return weatherAPI.getTemperature(city, country);
    }
}
