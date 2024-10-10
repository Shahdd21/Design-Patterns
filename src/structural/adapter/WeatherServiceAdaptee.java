package structural.adapter;

public class WeatherServiceAdaptee implements WeatherServiceAdapter{

    private final LegacyWeatherService legacyWeatherService;

    public WeatherServiceAdaptee(LegacyWeatherService legacyWeatherService) {
        this.legacyWeatherService = legacyWeatherService;
    }

    @Override
    public TemperatureData getTemperature(double longitude, double latitude) {
        String xmlData = legacyWeatherService.getTemperature(getCityOf(longitude,latitude),
                getCountryOf(longitude,latitude));

        return convertDataIntoJSON(xmlData);
    }

    private String getCityOf(double longitude, double latitude){
        System.out.printf("Getting city of longitude %2f and latitude %2f\n", longitude, latitude);
        return "City";
    }

    private String getCountryOf(double longitude, double latitude){
        System.out.printf("Getting country of longitude %2f and latitude %2f\n", longitude, latitude);
        return "Country";
    }

    private TemperatureData convertDataIntoJSON(String xmlData){
        return new TemperatureData("Converted JSON data");
    }
}
