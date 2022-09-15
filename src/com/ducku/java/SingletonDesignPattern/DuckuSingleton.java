package com.ducku.java.SingletonDesignPattern;

import java.util.Random;

public class DuckuSingleton {

  private int index;
  private volatile static DuckuSingleton ducku;

  private DuckuSingleton(int index) {
    this.index = index;
  }

  public static DuckuSingleton getInstance() {
    synchronized (DuckuSingleton.class) {
      if (ducku == null) {
        Random random = new Random();
        ducku = new DuckuSingleton(random.nextInt(5) + 1);
      }
    }
    return ducku;
  }

  public void myNumber() {
    System.out.println("My number is: " + ducku.index);
  }
}
