package com.ducku.java.dota2UseObserver;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

  private List<Observer> observerList;

  public SubjectImpl() {
    this.observerList = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void notifyAndShowStatus(String location) {
    observerList.forEach(observer -> observer.showStatus(location));
  }

  @Override
  public void removeObserver(Observer observer) {
    observerList.remove(observer);
  }
}
