package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeChange {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSShrijith\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\PSShrijith\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
	}
}
