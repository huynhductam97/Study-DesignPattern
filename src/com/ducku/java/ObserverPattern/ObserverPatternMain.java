package com.ducku.java.ObserverPattern;

public class ObserverPatternMain {

  public static void main(String[] args) {
//    WeatherData weatherData = new WeatherData();
//    NormalDisplay normalDisplay = new NormalDisplay(weatherData);
//    weatherData.setMeasurements(90f, 65, 30.4f);
//    weatherData.setMeasurements(120f, 75, 34.4f);
//    weatherData.setMeasurements(150f, 85, 36.5f);
    WeatherData weatherData = new WeatherData();
    NormalDisplay normalDisplay = new NormalDisplay();
    weatherData.registerObserver(normalDisplay);
    ClassicDisplay classicDisplay = new ClassicDisplay();
    weatherData.registerObserver(classicDisplay);
    weatherData.setMeasurements(90f, 65, 30.4f);
    weatherData.setMeasurements(120f, 75, 34.4f);
    weatherData.setMeasurements(150f, 85, 36.5f);
  }
}
