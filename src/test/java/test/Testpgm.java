package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Pagepgm;

public class Testpgm {
	WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://utest.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Pagepgm ob=new Pagepgm(driver);
		ob.start();
		ob.setvalues1("Varsha", "Suresh", "varshasuresh821@gmail.com");
		ob.datedeatils();
		ob.location();
		ob.nextdevice();
		ob.mobiledetails();
		ob.clickNextThird();
		ob.password("Varsha@999", "Varsha@999");
		ob.checkboxtick();
		ob.finalclick();
	}
	
}
