package com.ducku.java.ObserverPattern;

public interface Observer {

  void update(float temperature, float humidity, float pressure);
  void notifyAndDisplay(Subject subject, Object... parameters);
}
