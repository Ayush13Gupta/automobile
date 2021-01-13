package Testngscripts;

import org.testng.annotations.Test;

import Methodlib.setup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;

public class script {
	Properties prop;
	FileInputStream ip;
	setup s=new setup();
  @Test
  public void f() {
  }
  @Parameters({"browser"})
  @BeforeTest
   public void beforeTest(String browser) throws Exception  {
 	 
 			ip = new FileInputStream(".//fileutilities\\config.properties");
 			prop=new Properties();
 			prop.load(ip);
 	
 	String  Url=prop.getProperty("url");
 	  s.setupfor(browser, Url);

 	 
   }
  @AfterTest
  public void afterTest() {
	  s.TearDown();
  }

}
