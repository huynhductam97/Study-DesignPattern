package com.ducku.java.ObserverPattern;

public class ClassicDisplay implements Observer, Display {

  private float humidity;
  private float pressure;
  private float temperature;

  @Override
  public void display() {
    System.out.println("Deegrees: " + temperature + " huhmidity: " + humidity);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  @Override
  public void notifyAndDisplay(Subject subject, Object... parameters) {
    if (subject instanceof WeatherData) {
      this.temperature = ((WeatherData) subject).getTemperature();
      this.humidity = ((WeatherData) subject).getHumidity();
      this.pressure = ((WeatherData) subject).getPressure();
    }
    display();
  }
}
