package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtilityClass {

	public static WebDriver driver;
	//1 launch Browser
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	//2 launch Ulr
	public static void launchUrl(String url)	{
		driver.get(url);
	}
	//3 BrowserMaximize
	public static void browserMaximize() {
		driver.manage().window().maximize();
}
		//4 print cuttent  url
public static void printCurrentUrl() {
	System.out.println(driver.getCurrentUrl());
}

//5print title
public static void printTitle() {
System.out.println(driver.getTitle());

}

	//6close the browser
	public static void closeBrowser() {
		driver.close();
  }
   //7quit the browser
	public static void quitBrowser() {
		driver.quit();
}
	//8 fill value
public static void fillValue(WebElement e,String value) {
	e.sendKeys(value);
	}
//9 click btn
public static void clickBtn(WebElement e) {
e.click();	
}
// 10 move to element
public static void moveToElement(WebElement e) {
 Actions a=new Actions(driver);
 a.moveToElement(e).perform();
 }
//11 drang and drop
public static void drangAndDrop(WebElement src,WebElement dsc) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, dsc).perform();
}
//12doubleclick
public static void doubleClick(WebElement e) {
	Actions a=new Actions(driver);
	a.doubleClick().perform();
	}

//13contxtclick or rightclick
public static void rightClick(WebElement e) {	
	Actions a=new Actions(driver);
	a.contextClick(e).perform();
}

//14 up btn
public static void upBtn() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_UP);
}
//15 down btn
public static void downBtn() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
//16 Enter btn
public static void enterBtn() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
//17 tab btn
public static void tabBtn() throws AWTException {
Robot r= new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
}
//18 copy btn
public static void copyBtn() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
}
//19cut btn
public static void cutBtn() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_X);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_X);
}
//20 paste btn
public static void pasteBtn() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
}





}