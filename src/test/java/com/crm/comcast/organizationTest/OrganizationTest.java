package com.crm.comcast.organizationTest;

import org.testng.annotations.Test;

public class OrganizationTest
{
	 @Test(groups = "SmokeTest")
	  public void createorgTest()
	  {
		  System.out.println("===Org is created==");
	  }

	  @Test(groups = "RegressionTest")
	  public void editorgTest() 
	  {
		  System.out.println("===Org is edited==");
	  }
	  

	  @Test(groups = "RegressionTest")
	  public void deleteorgTest() {
		  System.out.println("===Org is deleted==");
	  }

}
