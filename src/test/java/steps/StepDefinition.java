package steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	
	@Before
	public void setUp()
	{
		System.out.println("I am in Before Hook Method, These will be executed whether fail or pass");
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		System.out.println("I am in after Hook Metho,These will be executed whether fail or pass");
	}
	
	

	@Given("user opens {string} browser")//
	public void user_opens_browser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
	   System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	   driver = new ChromeDriver ();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver  = new FirefoxDriver();
		}
		
		}

	@When("the user clicks on the image using xpath {string}")
	public void the_user_clicks_on_the_image_using_xpath(String string) {
	   driver.findElement(By.xpath(string)).click();
	}




	@Given("user launch app using url {string}")
	public void user_launch_app_using_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
	    
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		
	}

	@When("user clicks login button using xpath {string}")
	   public void user_clicks_login_button_using_xpath_input_name(String xpath) {
		  driver.findElement(By.xpath(xpath)).click();   
	}

/*	@Then("users validate the title to be {string}")
	public void users_validate_the_title_to_be(String expTitle) {
		
		Assert.assertEquals(driver.getTitle(), expTitle);
	    
	}
	*/
	

	@Given("user clicks link using xpath {string}")
	public void user_clicks_link_using_xpath(String xpath) {
	   driver.findElement(By.xpath(xpath)).click();
	}
	
	@Then("users validate the title to be {string}")
	public void users_validate_the_title_to_be(String expTitle) {


		Assert.assertEquals(driver.getTitle(), expTitle);
	}
	



	
	@When("user closes the browser")
	public void user_closes_the_browser() {
	    driver.quit();
	}
/*

	//@Given("user enters details in registration page")
	public void user_enters_details_in_registration_page(DataTable dataTable) {
    
	//Convert Data table to list of list for this scenario, check you need list of string or list of list by running Runner file and check for error	
		List<List<String>> allFields = dataTable.asLists();
		System.out.println("AllFields size: " + allFields.size());
		
		for (List<String> field:allFields)
		{
			for(String text:field)
			{
				System.out.println(text);
			}
		}
		//The other way to get the values in the field is below
		
		for(int i=0;i<allFields.size();i++)
		{
			for(int j=0;j<allFields.size();j++)
			{
				System.out.println(allFields.get(i).get(j));
			}
		}
		//We are getting values from feature file and passing it to the form here, accessing by index number, 
		//we have 1 row it's get(0) and then get(1,2,3,4) as column only changing. We have written one line in 
		//feature file and passed all values for it 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(allFields.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(allFields.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(allFields.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(allFields.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(allFields.get(0).get(4));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(allFields.get(0).get(5));
    
}*/

  

	@Given("user enters details in registration page")
	public void user_enters_details_in_registration_page1(DataTable dataTable) {
		
		//convert list of Maps (Key and Value concept)
		List<Map<String, String>> listOfMaps = dataTable.asMaps();
		System.out.println("list of Map size: " +listOfMaps.size());
		
    
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(listOfMaps.get(0).get("username"));//get 0 and get key which will give you value
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(listOfMaps.get(0).get("password"));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(listOfMaps.get(0).get("confimr password"));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(listOfMaps.get(0).get("full name"));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(listOfMaps.get(0).get("email id"));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(listOfMaps.get(0).get("captcha"));
		
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	
}
