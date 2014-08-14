package com.tavant;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class JavaTestNGTest2 {

  @Test
  public void sumab() {
	  JavaTestNG2 ab=new JavaTestNG2();
    Assert.assertEquals(5, ab.sumab(3, 2));
  }
}
