package seleinum.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassForDropdown {

	public static void main(String[] args) {
		//Assignment 1
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmugapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohankumar");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt1 = new Select(dropdown1);
		opt1.selectByIndex(4);
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt2 = new Select(dropdown2);
		opt2.selectByVisibleText("Automobile");
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt3 = new Select(dropdown3);
		opt3.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
		System.out.println("Title of WebPage:" +Title);
		//Delete
//		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.close();

	}

}
