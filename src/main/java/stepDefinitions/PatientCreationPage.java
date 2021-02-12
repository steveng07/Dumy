package stepDefinitions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class PatientCreationPage {

	WebDriver driver;
	String path = System.getProperty("user.dir");
	
	@Given("^Open the Chrome and Launch the application$")
	public void open_the_Chrome_and_Launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",path + "\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://localhost:3000/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}

	@When("^Enter the patient details$")
	public void enter_the_patient_details(DataTable credentials) throws Throwable {	 
	    try {
		
			List<List<String>> data = credentials.raw();
	    	//	driver.findElement(By.name("firstName")).sendKeys("John");  // First Name
        
         	driver.findElement(By.name("firstName")).sendKeys(data.get(0).get(0));
       	// driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
         	driver.findElement(By.name("firstName")).sendKeys(Keys.TAB);
			
         	
         	
         	driver.findElement(By.name("middleName")).sendKeys(data.get(0).get(1));  // Middle Name
			driver.findElement(By.name("middleName")).sendKeys(Keys.TAB);
			driver.findElement(By.name("lastName")).sendKeys(data.get(0).get(2));  // Last Name
			driver.findElement(By.name("lastName")).sendKeys(Keys.TAB);
			driver.findElement(By.name("phoneNumber")).sendKeys(data.get(0).get(3));  // Phone No
			driver.findElement(By.name("phoneNumber")).sendKeys(Keys.TAB);
			
			driver.findElement(By.name("dob")).sendKeys(data.get(0).get(4));  // Phone No
			driver.findElement(By.name("dob")).sendKeys(Keys.TAB);
			
			
			driver.findElement(By.name("address")).sendKeys("Addline 1, Addline 1, Aear, City, Country");  // Phone No
			
			
			
			
			
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	@When("^Click on Add New User$")
	public void click_on_Add_New_User() throws Throwable {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/a")).click();;
		
		Thread.sleep(5000);
		
	}

	@Then("^Close the page$")
	public void close_the_page() throws Throwable {
		
		 driver.quit();
	}

	
	
	
	
}
