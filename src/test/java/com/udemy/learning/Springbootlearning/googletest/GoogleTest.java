package com.udemy.learning.Springbootlearning.googletest;

import com.udemy.learning.Springbootlearning.SpringBaseTestNGTest;
import com.udemy.learning.Springbootlearning.config.Page.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends SpringBaseTestNGTest {

   @Autowired
   private GooglePage googlePage;


  @Test
  public void googleTest(){
   this.googlePage.goTo();
      Assert.assertTrue(this.googlePage.isAt());
      this.googlePage.getSearchComponent().search("spring boot");
     // Assert.assertTrue(this.googlePage.getSearchResult());

  }




}
