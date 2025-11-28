package C2_Observer_Pattern;

import C2_Observer_Pattern.DisplayChannels.CurrentConditionsDisplay;
import C2_Observer_Pattern.DisplayChannels.ForecastDisplay;
import C2_Observer_Pattern.DisplayChannels.HeatIndexDisplay;
import C2_Observer_Pattern.DisplayChannels.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData myObj = new WeatherData();

// selecting display that u want
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(myObj);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(myObj);
        ForecastDisplay forecastDisplay = new ForecastDisplay(myObj);
		HeatIndexDisplay hid = new HeatIndexDisplay(myObj);


//updating weather
        myObj.setMeasurements(80, 65, 30.4f);
        System.out.println();

        myObj.removeObserver(forecastDisplay);

        myObj.setMeasurements(82, 70, 29.2f);
        System.out.println();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(myObj);
        myObj.removeObserver(hid);

        myObj.setMeasurements(78, 90, 29.2f);


    }
}
