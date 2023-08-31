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
        System.out.println("Email sent");
        WebElement CardNumber = driver.findElement(By.id("card_number"));
        CardNumber.click();
        CardNumber.sendKeys("4242 4242 4242 4242");
        System.out.println("Card sent");
        WebElement Date = driver.findElement(By.id("cc-exp"));
        Date.click();
        Date.sendKeys("12/34");
        System.out.println("Date sent");
        WebElement CVC = driver.findElement(By.id("cc-csc"));
        CVC.click();
        CVC.sendKeys("123");
        System.out.println("CVC sent");
        driver.findElement(By.xpath("//*[@id=\"submitButton\"]/span/span")).click();
        System.out.println("Paid");
    }
}
