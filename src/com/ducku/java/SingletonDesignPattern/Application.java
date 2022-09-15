package com.ducku.java.SingletonDesignPattern;

public class Application {

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> DuckuSingleton.getInstance().myNumber());
    Thread t2 = new Thread(() -> DuckuSingleton.getInstance().myNumber());

    t1.start();
    t2.start();

  }
}
