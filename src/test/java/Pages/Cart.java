package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Cart {

    public static void CheckANDClick(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/nav/ul/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/button/span")).click();
        Thread.sleep(2000);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/iframe")));

        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("Mar@example.com");

        WebElement CardNumber = driver.findElement(By.id("card_number"));
        CardNumber.click();
        String cardnum = "4242";
        CardNumber.sendKeys(cardnum);
        CardNumber.sendKeys(cardnum);
        CardNumber.sendKeys(cardnum);
        CardNumber.sendKeys(cardnum);

        Thread.sleep(2000);

        WebElement Date = driver.findElement(By.id("cc-exp"));
        Date.click();
        Date.sendKeys("12");
        Date.sendKeys("34");

        WebElement CVC = driver.findElement(By.id("cc-csc"));
        CVC.click();
        CVC.sendKeys("123");

        WebElement ZipCode = driver.findElement(By.xpath("//*[@id=\"billing-zip\"]"));
        ZipCode.click();
        ZipCode.sendKeys("0000");

        driver.findElement(By.xpath("//*[@id=\"submitButton\"]/span/span")).click();
        Thread.sleep(5000);

        if (driver.getCurrentUrl().equals("https://weathershopper.pythonanywhere.com/confirmation")){
            if (driver.findElement(By.xpath("/html/body/div/div[1]/h2")).getText().equals("PAYMENT FAILED")){
                System.out.println("PAYMENT FAILED");
            }
            else{
                System.out.println("PAYMENT SUCCESS");
            }
        }
    }
}
