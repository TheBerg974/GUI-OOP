package finalexam;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label feedBackLabel;

    @FXML
    private ImageView montrealWeather;

    @FXML
    private ImageView honoluluWeather;

    @FXML
    private ImageView antarticaWeather;

    @FXML
    private Label minMtl;

    @FXML
    private Label maxMtl;

    @FXML
    private Label minHon;

    @FXML
    private Label maxHon;

    @FXML
    private Label minAnta;

    @FXML
    private Label maxAnta;

    WeatherItem montreal;
    WeatherItem honolulu;
    WeatherItem antarctica;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {

            montreal = getWeatherItem(WeatherController.getCurrentMontrealWeatherJSON());
            honolulu = getWeatherItem(WeatherController.getCurrentHonoluluWeatherJSON());
            antarctica = getWeatherItem(WeatherController.getCurrentAntarcticaWeatherJSON());

            montrealWeather.setImage(montreal.getWeatherIcon());
            honoluluWeather.setImage(honolulu.getWeatherIcon());
            antarticaWeather.setImage(antarctica.getWeatherIcon());

            minMtl.setText("Min: " + montreal.getMinTemperature() + "°C");
            maxMtl.setText("Max: " + montreal.getMaxTemperature() + "°C");

            minHon.setText("Min: " + honolulu.getMinTemperature() + "°C");
            maxHon.setText("Max: " + honolulu.getMaxTemperature() + "°C");

            minAnta.setText("Min: " + antarctica.getMinTemperature() + "°C");
            maxAnta.setText("Max: " + antarctica.getMaxTemperature() + "°C");

            feedBackLabel.setText("Weather Information succesfully retrieved!");

        } catch (Exception e) {
            feedBackLabel.setText("Error in retrieving the Weather Information");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public WeatherItem getWeatherItem(String jsonOutput) {

        WeatherItem currentWeather;
        double minTemp;
        double maxTemp;
        String icon;

        JsonObject root = new JsonParser().parse(jsonOutput).getAsJsonObject();
        JsonObject main = root.get("main").getAsJsonObject();
        JsonArray weather = root.get("weather").getAsJsonArray();

        minTemp = main.get("temp_min").getAsDouble();
        maxTemp = main.get("temp_max").getAsDouble();
        icon = weather.get(0).getAsJsonObject().get("icon").getAsString();

        currentWeather = new WeatherItem(minTemp, maxTemp, icon);

        return currentWeather;
    }

}
