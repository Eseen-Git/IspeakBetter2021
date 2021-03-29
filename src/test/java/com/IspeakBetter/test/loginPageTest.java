package com.IspeakBetter.test;

import java.util.Properties;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ispeakbetter.Base.BasePage;
import com.Ispeakbetter.pages.LoginPage;
import com.Ispeakbetter.Util.Constants;

public class loginPageTest {
	
	WebDriver driver;
	BasePage basepage;
	LoginPage loginPage;
	Properties prop;
	Constants cons;
	
	
	
@BeforeMethod

	public void setup() {
		
		basepage = new BasePage();
		driver= basepage.initialize_driver();
		loginPage = new LoginPage(driver);
		
		
		
	}


@Test (priority=1 )
public void GetTitle() {
	
	String Title=loginPage.getTitle();
	System.out.println(loginPage.getTitle());
	Assert.assertEquals(Title,Constants.lOGIN_PAGE_TITLE,"Title is ın correct");
	
	
}


@Test (priority=3 )
public void TryFreeTest() {	loginPage.TryFree();
	
}
@Test(priority=4 )
public void CoursesTest() {
	loginPage.Courses();
}

//@Test (priority=5 )
//public void LanguagesTest() {
	//loginPage.LanguageSelect();
//}

@Test (priority=2)
	
	public void Logintest() {
		loginPage.doLogin("elifbluts.11@gmail.com","Ee123456789.");
		
}
	@Test (priority=3 )
	public void BlogtTest() {
		
		loginPage.Blog();
	}

	//@Test (priority=7)
	//public void seeCoursesTest() {
		
		//loginPage.SeeCourses();
	//}

	//@Test 
	

	
	
}
