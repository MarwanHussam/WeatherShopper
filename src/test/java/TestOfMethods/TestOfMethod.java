package TestOfMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static Pages.CurrentTemp.*;
import static Pages.Moisturizers.*;
import static Pages.Sunscreens.*;
import static Pages.Cart.*;

public class TestOfMethod {

    private static WebDriver driver= null;

    public static void main(String[] args) throws InterruptedException {
        Action();
    }

    public static void Action() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedrivers\\chromedriver116\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://weathershopper.pythonanywhere.com/");
        driver.manage().window().maximize();

        PressBuy(driver);
        String url = driver.getCurrentUrl();
        if(url.equals("https://weathershopper.pythonanywhere.com/moisturizer")){
            MoistOne(driver);
        } else if (url.equals("https://weathershopper.pythonanywhere.com/sunscreen")) {
            sunscreenOne(driver);
        }
        CheckANDClick(driver);


        driver.close();
        driver.quit();
    }
    }
