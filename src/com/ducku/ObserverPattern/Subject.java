package com.ducku.ObserverPattern;

import com.ducku.ObserverPattern.Observer;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
