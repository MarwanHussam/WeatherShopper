package Pages;
import org.openqa.selenium.*;

public class Sunscreens {
    public String name;
    public int price;
    public WebElement Add_btn;

    public Sunscreens() {
    }

    public static void sunscreenOne(WebDriver driver) {
        Sunscreens suns = new Sunscreens();
        suns.name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[1]")).getText();
        String temp = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[2]")).getText();
        String last3 = temp.substring(temp.length() - 3);
        suns.price = Integer.parseInt(last3);
        suns.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
        System.out.println(suns.name);
        System.out.println(suns.price);

        Sunscreens suns1 = new Sunscreens();
        suns1.name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[1]")).getText();
        String temp1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[2]")).getText();
        String last31 = temp1.substring(temp1.length() - 3);
        suns1.price = Integer.parseInt(last31);
        suns1.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button"));
        System.out.println(suns1.name);
        System.out.println(suns1.price);

        Sunscreens suns2 = new Sunscreens();
        suns2.name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[1]")).getText();
        String temp2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[2]")).getText();
        String last32 = temp2.substring(temp2.length() - 3);
        suns2.price = Integer.parseInt(last32);
        suns2.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/button"));
        System.out.println(suns2.name);
        System.out.println(suns2.price);

        Sunscreens suns3 = new Sunscreens();
        suns3.name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[1]")).getText();
        String temp3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[2]")).getText();
        String last33 = temp3.substring(temp3.length() - 3);
        suns3.price = Integer.parseInt(last33);
        suns3.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/button"));
        System.out.println(suns3.name);
        System.out.println(suns3.price);

        Sunscreens suns4 = new Sunscreens();
        suns4.name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[1]")).getText();
        String temp4 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[2]")).getText();
        String last34 = temp4.substring(temp4.length() - 3);
        suns4.price = Integer.parseInt(last34);
        suns4.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
        System.out.println(suns4.name);
        System.out.println(suns4.price);

        Sunscreens suns5 = new Sunscreens();
        suns5.name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[1]")).getText();
        String temp5 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[2]")).getText();
        String last35 = temp5.substring(temp5.length() - 3);
        suns5.price = Integer.parseInt(last35);
        suns5.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/button"));
        System.out.println(suns5.name);
        System.out.println(suns5.price);

        String NumberOfItemsInCart = driver.findElement(By.xpath("//*[@id=\"cart\"]")).getText();


        Sunscreens[] Suns = new Sunscreens[6];
        Suns[0] = suns;
        Suns[1] = suns1;
        Suns[2] = suns2;
        Suns[3] = suns3;
        Suns[4] = suns4;
        Suns[5] = suns5;

        Sunscreens[] AlreadyInCart = new Sunscreens[2];

        for (int i = 0; i <= Suns.length - 1; i++) {

            if (Suns[i].name.contains("SPF-30") || Suns[i].name.contains("spf-30")) {
                System.out.println("this is Suns array " + Suns[i].name);
                if (i <= 4) {
                    if (Suns[i].price < Suns[i + 1].price) {
                        if (NumberOfItemsInCart.equals("Empty") || NumberOfItemsInCart.equals("1 item(s)")) {
                                    Suns[i].Add_btn.click();

                        }
                    }
                }
            } else if (Suns[i].name.contains("SPF-50")) {
                System.out.println("this is Suns array " + Suns[i].name);
                if (i <= 4) {
                    if (Suns[i].price < Suns[i + 1].price) {
                        if (NumberOfItemsInCart.equals("Empty") || NumberOfItemsInCart.equals("1 item(s)")){
                            Suns[i].Add_btn.click();

                            }
                }
                    }
            }
        }
    }
}


