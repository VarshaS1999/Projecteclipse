package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pagepgm {
	
	WebDriver driver;
	
	By startbutton=By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/home/div/ut-unauthenticated-home/div/div[1]/div[2]/div/a");
	By fname=By.xpath("//*[@id=\"firstName\"]");
	By lname=By.name("lastName");
	By emailid=By.name("email");
	By month=By.id("birthMonth");
	By day=By.id("birthDay");
	By year=By.id("birthYear");
	By nextlocation=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");
	By nextdevice=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span");
	By mobile=By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span");
	By mobile1=By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]");
	By model=By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]");
	By model1=By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div[1]/input");
	By os=By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]");
	By os1=By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div[1]/input");
	By click=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div");
	By password=By.xpath("//*[@id=\"password\"]");
	By confirmpass=By.xpath("//*[@id=\"confirmPassword\"]");

	By checkboxb1=By.xpath("//*/div/div[2]/div/div[2]/div/form/div[4]/label/input");
	By checkbox2=By.xpath("//*/div/div[2]/div/div[2]/div/form/div[5]/label/input");
	By checkbox3=By.xpath("//*/div/div[2]/div/div[2]/div/form/div[6]/label/input");
	
	By finalclick1=By.xpath("//*/div/div[2]/div/div[2]/div/div/div/a");
 public Pagepgm(WebDriver driver) {
	this.driver=driver;
}
	public void start()
	{
		driver.findElement(startbutton).click();
	}
	
	public void setvalues1(String name,String lastname,String mail)throws InterruptedException
	{ 
		Thread.sleep(2000);
		driver.findElement(fname).sendKeys(name);
		driver.findElement(lname).sendKeys(lastname);
		driver.findElement(emailid).sendKeys(mail);
	}
	
	public void datedeatils()
	{
		WebElement monthd=driver.findElement(month);
		Select monthdetails=new Select(monthd);
		monthdetails.selectByValue("number:1");
		
		WebElement dated=driver.findElement(day);
		Select mdaydetails=new Select(dated);
		mdaydetails.selectByValue("number:24");
		
		WebElement yeard=driver.findElement(year);
		Select yeardetails=new Select(yeard);
		yeardetails.selectByValue("number:1999");
		
		
		
	}
	
	public void location() 
	{
		driver.findElement(nextlocation).click();
		
	}
	public void nextdevice() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(nextdevice).click();
	}
    
	public void mobiledetails() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(mobile).click();
		Thread.sleep(1000);
		driver.findElement(mobile1).sendKeys("Xiaomi",Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(model).click();
		Thread.sleep(1000);
		driver.findElement(model1).sendKeys("Redmi Note 7",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(os).click();
		Thread.sleep(1000);
		driver.findElement(os1).sendKeys("Android 10",Keys.TAB);
	}
	public void clickNextThird() {
		driver.findElement(click).click();
	}

	public void password(String pass,String conpass)
	{
		driver.findElement(password).sendKeys(pass);
		driver.findElement(confirmpass).sendKeys(conpass);
	}
		
	public void checkboxtick() {
		driver.findElement(checkboxb1).click();
		driver.findElement(checkbox2).click();
		driver.findElement(checkbox3).click();
	}

	public void finalclick() {
		driver.findElement(finalclick1).click();
		
	}
	}

