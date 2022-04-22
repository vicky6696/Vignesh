package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {

	public static WebDriver driver;

	// Browser Launching
	public static WebDriver Browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse-workspace\\Selenium_Testing\\Driver\\chromeversion99.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	// to get URL
	public static void GetURL(String url) {
		driver.get(url);
	}

	// to Close
	public static void Close() {
		driver.close();
	}

	// to Quit
	public static void Quit() {
		driver.quit();
	}

	// to Navigate
	public static void Navigate_to(String url) {
		driver.navigate().to(url);
	}

	// to Navigate back
	public static void Navigate_back() {
		driver.navigate().back();
	}

	// to Navigate forward
	public static void Navigate_forward() {
		driver.navigate().forward();
	}

	// to Navigate refresh
	public static void Navigate_refresh() {
		driver.navigate().refresh();
	}

	// to Get Title
	public static void Get_title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// to Get Current URL
	public static void Get_Current_url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// to Get Text
	public static void Get_Text(WebElement element) {
		String GT = element.getText();
		System.out.println(GT);
	}

	// to Get Attribute
	public static void Get_Attribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}

	// to SendKeys
	public static void Sendkeys(WebElement element, String input) {
		element.sendKeys(input);
	}

	// to clear
	public static void clear(WebElement element) {
		element.clear();
	}

	// Is_displayed
	public static void Isdisplayed(WebElement element) {
		boolean dis = element.isDisplayed();
		System.out.println(dis);
	}

	// Is_enabled
	public static void Isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	// Is_Selected
	public static void Isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	// to Wait
	public static void Implicity_wait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}

	// actions
	public static void actions(WebElement element, String s) {
		Actions a = new Actions(driver);

		if (s.equalsIgnoreCase("Drag")) {
			a.clickAndHold(element).build().perform();
		} else if (s.equalsIgnoreCase("drop")) {
			a.moveToElement(element).build().perform();
		} else if (s.equalsIgnoreCase("Click")) {
			a.click(element).build().perform();
		} else if (s.equalsIgnoreCase("Context click")) {
			a.contextClick(element).build().perform();
		} else if (s.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).perform();
		}
	}

	// Thread Sleep
	public static void Thread_Sleep(int s) throws InterruptedException {
		Thread.sleep(s);
	}

	// Single Drop_down
	public static void Single_Dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);

		if (type.equalsIgnoreCase("Index")) {
			int num = Integer.parseInt(value);
			s.selectByIndex(num);
			
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}
	
	//Multiple_Drop_down
	public static void Multiple_dropdown(WebElement element, String name) {
		Select s = new Select(element);
		
		if (name.equalsIgnoreCase("Get Options")) {
			List<WebElement> options = s.getOptions();
			for (WebElement All : options) {
				String text = All.getText();
				System.out.println(text);
			}}
			
			else if (name.equalsIgnoreCase("Get All Selected Options")) {
				List<WebElement> allSelected = s.getAllSelectedOptions();
			for (WebElement All : allSelected) {
				String text = All.getText();
                System.out.println(text);			
			}}
			else if (name.equalsIgnoreCase("Get First Selected Option")) {
				WebElement firstSelected = s.getFirstSelectedOption();
				String All = firstSelected.getText();
				System.out.println(All);
			}
			else if (name.equalsIgnoreCase("Is multiple")) {
				boolean multiple = s.isMultiple();
				System.out.println(multiple);
			}
			
			}
	
	// Scroll_down
	public static void Scrolldown(String s, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(s, element);

	}

   //screenshot
	public static void screenshot(String s) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s1 = ts.getScreenshotAs(OutputType.FILE);
		File ss = new File("C:\\Users\\WELCOME\\eclipse-workspace\\Selenium_Testing\\Screenshot\\" +  ".png");
		FileUtils.copyFile(s1, ss);
	}
	
   //robot
	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

  //frames
	public static void frame() {
		driver.switchTo().frame(0);

	}

	public static void frames() {
		driver.switchTo().defaultContent();

	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	//Window_Handles
	public static void Window_Handles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String ID : windowHandles) {
			String title = driver.switchTo().window(ID).getTitle();
			System.out.println(title);
		}
	}
}