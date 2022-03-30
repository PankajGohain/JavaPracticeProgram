package package2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());

		List<String> urlList = new ArrayList<String>();

		for (WebElement e : linkList) {
			String url = e.getAttribute("href");
			urlList.add(url);
		}

		urlList.parallelStream().forEach(e -> {
			try {
				checkBrokenLinks(e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

	}

	public static void checkBrokenLinks(String urlToCheck) throws IOException {
		int count = 0;
		URL url = new URL(urlToCheck);
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		httpConnection.setConnectTimeout(5000);
		httpConnection.connect();

		if (httpConnection.getResponseCode() >= 400) {
			System.out.println(urlToCheck + "===>" + httpConnection.getResponseMessage() + "is broken");
		} else {
			System.out.println(urlToCheck + "===>" + httpConnection.getResponseMessage());
		}
		count++;
		System.out.println("Total number of broken links are" + count);
	}

}
