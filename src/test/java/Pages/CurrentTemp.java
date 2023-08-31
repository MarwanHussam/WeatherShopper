package Pages;
import org.openqa.selenium.*;


public class CurrentTemp {
    public static WebElement element;
    public static void PressBuy(WebDriver driver){
        element = driver.findElement(By.id("temperature"));
        String val = element.getText();
        if(val.length()>3){
        val = val.substring(0,2);
        }
        else if (val.length()<=3){
            val = val.substring(0,1);
        }
        int temperature = Integer.parseInt(val);
        WebElement Moisturizer_btn = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/a/button"));
        WebElement Sunscreen_btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/a/button"));
        if(temperature<=19)
            Moisturizer_btn.click();
        else if (temperature>=34)
            Sunscreen_btn.click();
    }


}
