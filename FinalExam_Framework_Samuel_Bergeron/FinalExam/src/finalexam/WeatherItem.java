package finalexam;

import javafx.scene.image.Image;


public class WeatherItem {
    private double minTemp;
    private double maxTemp;
    private Image weatherIcon;

    
    public WeatherItem(double minTemp, double maxTemp, String weatherIconName)
    {
        // Round temperatures to 1 decimal
        this.minTemp = ((int)(minTemp * 10) / 10.0);
        this.maxTemp = ((int)(maxTemp * 10) / 10.0);
        
        // icons come from the web at the following URL
        this.weatherIcon = new Image("http://openweathermap.org/img/w/" + weatherIconName + ".png", 256, 256, true, true);
    }
    
    public Image getWeatherIcon()
    {
        return weatherIcon;
    }
    
    public double getMinTemperature()
    {
        return minTemp;
    }
    
    public double getMaxTemperature()
    {
        return maxTemp;
    }
    
    
}
