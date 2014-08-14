package com.tavant;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class JavaTestNGTest {

  @Test
  public void sumab() {
	  JavaTestNG ab=new JavaTestNG();
    Assert.assertEquals(5, ab.sumab(3, 2));
  }
}
