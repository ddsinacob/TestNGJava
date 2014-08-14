package com.tavant;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class JavaTestNGTest1 {

  @Test
  public void sumab() {
	  JavaTestNG1 ab=new JavaTestNG1();
    Assert.assertEquals(5, ab.sumab(3, 2));
  }
}
