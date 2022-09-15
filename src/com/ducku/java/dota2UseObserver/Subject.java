package com.ducku.java.dota2UseObserver;

public interface Subject {

  void registerObserver(Observer observer);

  void notifyAndShowStatus(String location);

  void removeObserver(Observer observer);
}
