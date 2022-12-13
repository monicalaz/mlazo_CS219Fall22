package ZipcodeZB;

import utility.Weather;

public class Zipcode implements Comparable <Zipcode>{

    /*
     *  Hold data about one zipcode
     */

        private String code;
        private String state; // two character code abbreviation
        private String city;
        private double lng;
        private String lat;
        private int pop;

        public Zipcode(String code, String state, String city, double lng, double lat, int pop) {
            this.code = code;
            this.state = state;
            this.city = city;
            this.lng = lng;
            this.lat = lat;
            this.pop = pop;
        }

        public String toString() {
            return "Zipcode{" +
                    "code='" + code + '\'' +
                    ", state='" + state + '\'' +
                    ", city='" + city + '\'' +
                    ", lng=" + lng +
                    ", lat=" + lat +
                    ", pop=" + pop +
                    '}';
        }
        public int compareTo(Zipcode zc){
            return this.code.compareTo(zc.code);

        }
    WeatherObservation = zipcode.getWeatherData;{
            WeatherObservation.import(//http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=44&lng=-74&username=edharcourt)
    }

}



