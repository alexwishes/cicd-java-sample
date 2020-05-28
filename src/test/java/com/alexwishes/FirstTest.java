package com.alexwishes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test
  public void f() {
	  System.out.println("Test OK");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test OK");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test OK");
  }

}
