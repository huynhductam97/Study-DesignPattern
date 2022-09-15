package com.ducku.java.dota2UseObserver;

public class Dotamain {

  public static void main(String[] args) {
    Character riki = new Character("Riki");
    Character sniper = new Character("Sniper");
    Character yasuo = new Character("Yasuo");
    SubjectImpl subject = new SubjectImpl();
    subject.registerObserver(riki);
    subject.registerObserver(sniper);
    subject.registerObserver(yasuo);
    subject.notifyAndShowStatus("123  456");
  }
}
