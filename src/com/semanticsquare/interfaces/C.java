package com.semanticsquare.interfaces;

/**
 * @author ABC Inc.
 */
public interface C extends A {
   void foobar();
   default void go() {
      System.out.println("C: go");
   }
}