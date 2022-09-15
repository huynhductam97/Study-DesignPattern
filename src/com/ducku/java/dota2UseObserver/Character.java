package com.ducku.java.dota2UseObserver;

public class Character implements Observer {

  private String name;
  private String location;

  public Character(String name) {
    this.name = name;
  }

  @Override
  public void update(String location) {
    this.location = location;
    showStatus(location);
  }

  @Override
  public void showStatus(String location) {
    System.out.println(name + " need help at " + location);
  }
}
