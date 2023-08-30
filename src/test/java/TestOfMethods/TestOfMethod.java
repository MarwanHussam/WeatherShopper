package TestOfMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
    public static void main(String[] args) {
        ACT();
    }

    public static void ACT(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedrivers\\chromedriver116\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://transmission-dev.azurewebsites.net/login");
        driver.manage().window().maximize();
    }
}
