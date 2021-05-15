package com.springboot.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootSeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSeleniumApplication.class, args);
	}

//	@EventListener({ ApplicationReadyEvent.class })
//	private void applicationReadyEvent() {
//		String url = "http://localhost:8080";
//
//		// pointing to the download driver
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya\\Documents\\BrowserStack\\chromedriver.exe");
//		ChromeDriver chromeDriver = new ChromeDriver();
//		chromeDriver.get(url);
//		
//	}
	
}
