package com.Ispeakbetter.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Ispeakbetter.Base.BasePage;
public class LoginPage extends BasePage{

	WebDriver driver;
	
	//locators
	By LoginBtn =By.xpath("//*[@id=\"cmdSiginLink\"]");
	By emailInpt= By.xpath("//*[@id=\"_email\"]");
	By password =By.xpath("//*[@id=\"_password\"]");
	By singinBtn = By.xpath("//*[@id=\"cmdSignin\"]");
	By tryfeeBtn =By.xpath("//a[@id='btnFree']");
	By CancelBtn = By.xpath("//*[@id=\"frmSignup\"]/footer/button[1]");
	By CoursesBtn = By.xpath("//*[@id=\"mobile-navbar-collapse\"]/ul/li[4]/a/span");
	By Languages = By.xpath("//*[@id=\"dropdownMenuLink\"]");
	By TurkceBtn = By.xpath("//*[@id=\"langTr\"]");
	By BlogBtn = By.xpath("//*[@id=\"mobile-navbar-collapse\"]/ul/li[2]/a");
	By vocablary = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[1]/div[2]/center/a");
	By SeeCourses= By.xpath("//*[@id=\"about-section\"]/div/div/div[1]/a");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	// page actions
	
	public String getTitle() {
		String text = driver.getTitle();
		
		return text;
			
	}
	
	public void SeeCourses() {
		driver.findElement(SeeCourses).click();
	}
	public void Blog() {
		driver.findElement(BlogBtn).click();
		
	}
	
	public void LanguageSelect() {
		driver.findElement(Languages).click();
		driver.findElement(TurkceBtn).click();
	}
	
	
public void Courses() {
	
	driver.findElement(CoursesBtn).click();
	
}
	
	public void doLogin(String email,String Pwrd) {
		driver.findElement(LoginBtn).click();
		driver.findElement(emailInpt).clear();
		driver.findElement(emailInpt).sendKeys(email);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(Pwrd);
		driver.findElement(singinBtn).click();
		
		
		
	}
	
	public void TryFree() {
		
		driver.findElement(tryfeeBtn).click();
		driver.findElement(CancelBtn).click();
	}
}
