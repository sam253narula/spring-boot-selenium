package com.springboot.selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrowserController {

	@GetMapping("/test")
	public void openChrome() throws Throwable {
		applicationReadyEvent();
	}

//	@EventListener({ ApplicationReadyEvent.class })
	private void applicationReadyEvent() {
		String url = "https://www.google.com/";

		// pointing to the download driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya\\Documents\\BrowserStack\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // switches to new tab
		System.out.println(driver.getCurrentUrl());
	}

}
