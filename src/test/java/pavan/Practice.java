package pavan;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void m1() throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		WebElement e = driver.findElement(By.xpath("//textarea[@name=\"q\"]"));

		e.click();

		Actions act = new Actions(driver);

		act.keyDown(Keys.LEFT_SHIFT).sendKeys("pavankalyan").keyUp(Keys.LEFT_SHIFT).keyDown(Keys.NUMPAD1)
				.keyUp(Keys.NUMPAD1).perform();
	}

	@Test
	public void m2() {

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("pavan");
		hs.add("kalyan");
		hs.add("kalpana");
		hs.add("vijay");

		ArrayList<String> al = new ArrayList<String>(hs);

		ListIterator<String> li = al.listIterator(al.size());

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

	@Test
	public void m3() {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(20);
		l.add(21);
		l.add(22);
		l.add(23);
		l.add(24);
		System.out.println(l);
	}

	@Test
	public void m4() {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(15);
		ts.add(12);
		ts.add(11);
		ts.add(1);

		System.out.println(ts.first());
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts);
	}
}