package ZipcodeZB;

public class WeatherObservation {
    private double humidity;
    private double windspeed;
    private double temperature;
    private String clouds;


    public WeatherObservation(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherObservation{" +
                "humidity=" + humidity +
                ", windspeed=" + windspeed +
                ", temperature=" + temperature +
                ", clouds='" + clouds + '\'' +
                '}';
        //http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=44&lng=-74&username=edharcourt
    }
}
