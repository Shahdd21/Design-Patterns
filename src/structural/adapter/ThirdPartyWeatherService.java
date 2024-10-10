package structural.adapter;

public class ThirdPartyWeatherService {

    public String getTemperature(String city, String country){
        System.out.println("Fetching temperature data in XML format...");
        return "Temperature in XML format";
    }
}
