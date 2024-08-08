package pavan;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ValidateDownloadedFile {

	@Test
	public void m1() throws Throwable {

		// generate unique name for the file
		Random r = new Random();
		int n = r.nextInt(100);

		String fileName = "resume" + n + ".txt";

		// use chrome options to download the file to desired location in local sysytem
		ChromeOptions opt = new ChromeOptions();

		// store path of file in a String reference
		String path = "C:\\Users\\divya\\OneDrive\\Desktop\\downloaded";

		// add path in to a Map
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", path);

		// using setExperimentalOption load the map object in to chrome options
		// reference
		opt.setExperimentalOption("prefs", prefs);

		// launch chrome browser and pass chrome options reference to ChromeDriver
		WebDriver driver = new ChromeDriver(opt);

		// navigate to demo Qspiders application
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		Thread.sleep(3000);

		// select pass data into text field in web page
		driver.findElement(By.xpath("//textarea[@name='textarea']")).sendKeys("pavankalyan");

		// clear the existing file name and give the generated unique name
		WebElement e = driver.findElement(By.xpath("//input[@id='fileName']"));
		e.clear();
		e.sendKeys(fileName);

		// click on download
		driver.findElement(By.xpath("//button[@id=\"downloadButton\"]")).click();

		// wait until the file to be downloaded
		Thread.sleep(5000);

		// using File class locate the file in local system
		File f = new File("C:\\Users\\divya\\OneDrive\\Desktop\\downloaded\\" + fileName);

		/*
		 * exists method in File class will true if the file is found at the specified
		 * location, if file not found then it will return false
		 */
		if (f.exists()) {

			System.out.println("File downloaded successfully");
		} else {

			System.out.println("File not downloaded");
		}
	}
}
