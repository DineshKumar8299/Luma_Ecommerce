package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lumastepdefinition {
    public static WebDriver driver;
    long Starttime;
    long Endtime;
    long Totaltime;
 
	@Given("user lanuch the Appliction")
	public void user_lanuch_the_Appliction() {
		Starttime=System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://magento.softwaretestingboard.com/gear.html");
	}

	@Given("user click Create Account option")
	public void user_click_Create_Account_option() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement createaccount= driver.findElement(By.linkText("Create an Account"));
		createaccount.click();
	}

	@When("user enter Personal and Signin informtion")
	public void user_enter_Personal_and_Signin_informtion() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  WebElement firstname=driver.findElement(By.id("firstname"));
		  firstname.sendKeys("Dinesh Kumar");
		  WebElement lastname=driver.findElement(By.id("lastname"));
		  lastname.sendKeys("B S");
		  WebElement checkbox=driver.findElement(By.id("is_subscribed"));
		  checkbox.click();
		  WebElement email=driver.findElement(By.id("email_address"));
		  email.sendKeys("dineshkumar50@gmail.com");
		  WebElement password=driver.findElement(By.id("password"));
		  password.sendKeys("Dinesh@123");
		  WebElement conformpassword=driver.findElement(By.id("password-confirmation"));
		  conformpassword.sendKeys("Dinesh@123");
	}

	@When("user click Create an account button")
	public void user_click_Create_an_account_button() {
		  WebElement click=driver.findElement(By.xpath("//button[@title='Create an Account'][@type='submit']"));
		  click.click();
	}

	@Then("user verify the Account creation")
	public void user_verify_the_Account_creation() {
		  System.out.println(" user getting messege = thanks for rigistering the fake online clothing account");
	}

	@When("user enter email Subscription")
	public void user_enter_email_Subscription() {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  WebElement emailsub= driver.findElement(By.xpath("//input[@placeholder='Enter your email address']"));
		  emailsub.sendKeys("dineshkumar51@gmail.com");
	}

	@When("user click subscribe button")
	public void user_click_subscribe_button() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		  driver.findElement(By.xpath("//span[contains(text(),'Subscribe')]")).click();
		  Thread.sleep(2000);
	    
	}
	
	@Then("user getting email subscription messge")
	public void user_getting_email_subscription_messge() {
	      System.out.println("user geting thanks for rigistering the mail");
	}

	@Given("user click signin option")
	public void user_click_signin_option() {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      WebElement Accountaction=driver.findElement(By.xpath("(//button[@data-action='customer-menu-toggle'])[1]"));
		  Accountaction.click();
		  WebElement signout=driver.findElement(By.xpath("(//a[contains(text(),'Sign Out')])[1]"));
		  signout.click();
		
		  WebElement signin= driver.findElement(By.linkText("Sign In"));
		  signin.click();
	}

	@Then("user enter login Page")
	public void user_enter_login_Page() {
	      System.out.println("user navigate in to login pagr");
	}

	
	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement username=driver.findElement(By.id("email"));
		 username.sendKeys("dineshkumar50@gmail.com");
		 WebElement password=driver.findElement(By.id("pass"));
		 password.sendKeys("Dinesh@123");
	}
 
	@When("user click login button")
	public void user_click_login_button() throws InterruptedException {
		 WebElement login=driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]"));
		 login.click();
		 Thread.sleep(3000);
	}

	@Then("user verify the Page is  Successfully login.")
	public void user_verify_the_Page_is_Successfully_login() {
		 System.out.println("user verify the Page is  Successfully login");
	}


	

	@When("User capture the image")
	public void user_capture_the_image() throws IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement Image=driver.findElement(By.xpath("//img/parent::a[@class='logo']"));
		 File src=Image.getScreenshotAs(OutputType.FILE);
		 File Location=new File("C://Users//Dinesh Kumar//Pictures//Screenshots//image11.png");
		 FileHandler.copy(src, Location);
	}

	@When("User getting Image properties")
	public void user_getting_Image_properties() {
		 WebElement Image=driver.findElement(By.xpath("//img/parent::a[@class='logo']"));
			
			org.openqa.selenium.Point XYvalue=Image.getLocation();
			int xvalue=XYvalue.getX();
			int yvalue=XYvalue.getY();
			System.out.println("X position is "+xvalue);
			System.out.println("Y position is "+yvalue);
			
			
			String color=Image.getCssValue("color");
			System.out.println("the color of the button is "+color);
		
	        int height  =Image.getSize().getHeight();
	        int width  = Image.getSize().getWidth();
	        System.out.println("Height of the image is "+height);
	        System.out.println("width of the  image is "+width);
	}

	@Then("User verifying the image capture successfully")
	public void user_verifying_the_image_capture_successfully() {
		 System.out.println("User verifying the image capture successfully");
	}

	@When("user searching products in searchbar")
	public void user_searching_products_in_searchbar() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement textbox=driver.findElement(By.id("search"));
		textbox.sendKeys("Mens T SHirt"+Keys.ENTER);
		Thread.sleep(4000);
	}

	@When("user clicks the product")
	public void user_clicks_the_product() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='product-item-link'][contains(text(),'Gobi HeatTec® Tee')]"));
		   
		   WebElement XS=driver.findElement(By.xpath("(//div[contains(text(),'XS')])[3]"));
		   XS.click();
		   WebElement orange=driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-56'])[3]"));
		   orange.click();
		   WebElement addcart=driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[3]"));
		   addcart.click();
	}

	@Then("user verify productt add to cart")
	public void user_verify_productt_add_to_cart() {
		  System.out.println("user navigated into next page successfully");
	}

	@Given("user click the Womenbar")
	public void user_click_the_Womenbar() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 Thread.sleep(3000);
		 WebElement women=driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
	     women.click();
	     Thread.sleep(3000);
	}

	@When("user search the womenproduct")
	public void user_search_the_womenproduct() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		   WebElement tops=driver.findElement(By.linkText("Tops"));
		   tops.click();
		   Thread.sleep(2000);
		   
		   WebElement sortby=driver.findElement(By.id("sorter"));
		   Select slt=new Select(sortby);
		   slt.selectByIndex(1);
		   Thread.sleep(2000);
		   
		   WebElement categry=driver.findElement(By.xpath("(//div[@class='filter-options-title'])[1]"));
		   categry.click();
		   Thread.sleep(2000);
		   
		   WebElement jacket=driver.findElement(By.xpath("//a[contains(text(),'Jackets')]"));
		   jacket.click();
		   Thread.sleep(2000);
		   
		   WebElement adrinojak=driver.findElement(By.xpath("//a[contains(text(),'Adrienne Trek Jacket')]"));
		   adrinojak.click();
		   Thread.sleep(2000);
	}

	@Then("user verify the page is navigated")
	public void user_verify_the_page_is_navigated() {
		 System.out.println(" user verify the page is navigate into next page sucessfully");
	}

	@Given("user clicks size of the product")
	public void user_clicks_size_of_the_product() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Thread.sleep(2000);
		   WebElement size=driver.findElement(By.xpath("//div[contains(text(),'M')][@index='2']"));
		   size.click();
		   System.out.println("size is clicked");
	}

	@Given("user clicks colour of the product")
	public void user_clicks_colour_of_the_product() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement colour=driver.findElement(By.xpath("//div[@id='option-label-color-93-item-56'][@index='1']"));
		 colour.click();
	}

	@Given("user clicks addtocat button")
	public void user_clicks_addtocat_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement Addtocart=driver.findElement(By.xpath("//button[@id='product-addtocart-button']/child::span"));
		 Addtocart.click(); 
		   
		 Thread.sleep(5000);
	}

	@Then("user verify the product is added into the cart")
	public void user_verify_the_product_is_added_into_the_cart() {
		System.out.println("user click the product into the cart");
	}

	@Given("user click the addtocart")
	public void user_click_the_addtocart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement Addtocartclick=driver.findElement(By.xpath("//a[@class='action showcart']"));
	     Addtocartclick.click();
	   
	     Thread.sleep(2000);
	}

	@Given("user click the procced button")
	public void user_click_the_procced_button() throws InterruptedException {
		
		WebElement Addtoproced=driver.findElement(By.id("top-cart-btn-checkout"));
	    Addtoproced.click();
		Thread.sleep(13000);
	}

	@Then("user navigate purchase page")
	public void user_navigate_purchase_page() {
		System.out.println(" user navigate next page for purchse");
	}

	@When("user enter Address")
	public void user_enter_Address() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 WebElement company=driver.findElement(By.xpath("//input[@name='company'][@type='text'][@aria-invalid='false']"));
		   company.sendKeys("luma");
		   

		   WebElement address1=driver.findElement(By.xpath("//input[@name='street[0]']"));
		   address1.sendKeys("101, ntk st");
		   

		   WebElement line2=driver.findElement(By.xpath("//input[@name='street[1]']"));
		   line2.sendKeys("podatur pet");
		   
		   WebElement contry=driver.findElement(By.xpath("//select[@name='country_id']"));
		   Select selectcontry=new Select(contry);
		   selectcontry.selectByValue("IN");
		
		   WebElement riligion=driver.findElement(By.xpath("//select[@class='select'][@name='region_id']"));
		   Select selectregion=new Select(riligion);
		   List<WebElement> options = selectregion.getOptions();
		   int numbersize=options.size();
		   System.out.println( "The nuber of optons are in dropdown " +numbersize);
		   for (WebElement webelement : options) 
		   {
			   
			 if(webelement.getText().startsWith("Tamil"))
					 {
				       webelement.click();
				       break;
					 }
		 
		    }
		 

		   WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		   city.sendKeys("Podatur Pet");
		 
		  
		   WebElement zipcode=driver.findElement(By.xpath("//input[@name='postcode']"));
		   zipcode.sendKeys("631208");
		   
		   WebElement phonenumber=driver.findElement(By.xpath("//input[@name='telephone']"));
		   phonenumber.sendKeys("631208456");
	}

	@Given("user enter rate of product")
	public void user_enter_rate_of_product() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		 WebElement radio1=driver.findElement(By.xpath("//input[@class='radio'][@value='flatrate_flatrate']/parent::td"));
		 radio1.click();
		 
	}

	@Given("user enter next button")
	public void user_enter_next_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement next=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		 next.click();
		 Thread.sleep(6000);
	}

	@Then("user enter payment Portion")
	public void user_enter_payment_Portion() {
		 System.out.println("user navigate into payment portion ");
	}

	@Then("user place the order")
	public void user_place_the_order() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement placeorder=driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
		 placeorder.click();
	}

	@Then("verify the order placed and capture Order ID")
	public void verify_the_order_placed_and_capture_Order_ID() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
         System.out.println(" user verify the order is placed and order id is printed ");
		 
		 WebElement orderid=driver.findElement(By.xpath("//a[@class='order-number']"));
		 String id=orderid.getText();
		 System.out.println("your order id is :- "+id);
		 Thread.sleep(10000);
		 
		 driver.quit();
		 
		 Endtime=System.currentTimeMillis();
		 Totaltime=Starttime-Endtime;
		 System.out.println("Totel time are taken by the browser is "+Totaltime);
	}


}
