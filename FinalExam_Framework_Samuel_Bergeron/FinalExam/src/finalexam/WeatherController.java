package finalexam;

public class WeatherController {

    // This is data hardcoded from the openweathermap.org website
    // You can sign-up to get an API key and retrive real-time
    // weather forecast for free!
    //
    // This string comes from the Montreal forecast on 10/04/2017:
    // http://api.openweathermap.org/data/2.5/weather?id=6077243&units=metric&APPID=[API_KEY]
    //
    // Don't try to read this, you will get a headache. Try pasting the string in:
    // https://jsonformatter.curiousconcept.com
    // 
    // You can also get the API documentation here: 
    // http://openweathermap.org/current#current_JSON
    public static String getCurrentMontrealWeatherJSON() {
        return "{\"coord\":{\"lon\":-73.59,\"lat\":45.51},\"weather\":[{\"id\":701,\"main\":\"Mist\",\"description\":\"mist\",\"icon\":\"50d\"},{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"},{\"id\":741,\"main\":\"Fog\",\"description\":\"fog\",\"icon\":\"50d\"}],\"base\":\"stations\",\"main\":{\"temp\":1.65,\"pressure\":1010,\"humidity\":100,\"temp_min\":1,\"temp_max\":2},\"visibility\":4828,\"wind\":{\"speed\":3.6,\"deg\":30},\"clouds\":{\"all\":90},\"dt\":1543252080,\"sys\":{\"type\":1,\"id\":3851,\"message\":0.0598,\"country\":\"CA\",\"sunrise\":1543234138,\"sunset\":1543266874},\"id\":6077243,\"name\":\"Montreal\",\"cod\":200}";
    }

    // Same as above, but with City ID: 6255152
    public static String getCurrentAntarcticaWeatherJSON() {
        return "{\"coord\":{\"lon\":16.41,\"lat\":-78.16},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01d\"}],\"base\":\"stations\",\"main\":{\"temp\":-29.77,\"pressure\":657.76,\"humidity\":61,\"temp_min\":-29.77,\"temp_max\":-29.77,\"sea_level\":1015.7,\"grnd_level\":657.76},\"wind\":{\"speed\":3.46,\"deg\":120.501},\"clouds\":{\"all\":0},\"dt\":1543255665,\"sys\":{\"message\":0.0049,\"sunrise\":0,\"sunset\":0},\"id\":6255152,\"name\":\"Antarctica\",\"cod\":200}";
    }

    // City ID: 5856195
    public static String getCurrentHonoluluWeatherJSON() {
        return "{\"coord\":{\"lon\":-157.86,\"lat\":21.31},\"weather\":[{\"id\":801,\"main\":\"Clouds\",\"description\":\"few clouds\",\"icon\":\"02d\"}],\"base\":\"stations\",\"main\":{\"temp\":20.5,\"pressure\":1018,\"humidity\":86,\"temp_min\":18.2,\"temp_max\":22.8},\"visibility\":16093,\"wind\":{\"speed\":2.1,\"deg\":330},\"clouds\":{\"all\":20},\"dt\":1543251420,\"sys\":{\"type\":1,\"id\":819,\"message\":0.1057,\"country\":\"US\",\"sunrise\":1543250992,\"sunset\":1543290491},\"id\":5856195,\"name\":\"Honolulu\",\"cod\":200}";
    }
}
