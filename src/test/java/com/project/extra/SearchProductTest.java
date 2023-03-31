package com.project.extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest {
	
		@Test
		public void SearchProductUser(){
			System.out.println("This test is for Search Product user");
		}
		
		@Test(enabled = false) // it will not be executable
		public void searchSpecificProductTest() {
			Assert.fail("Some reason");   // we are purposely failing this test case
		}

}
