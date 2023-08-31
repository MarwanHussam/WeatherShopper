package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Moisturizers {
    public String name;
    public int price;
    public WebElement Add_btn;

    public Moisturizers() {

    }

    public static void MoistOne(WebDriver driver) {

        Moisturizers Moisty = new Moisturizers();
        Moisty.name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[1]")).getText();
        String temp = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[2]")).getText();
        String last3 = temp.substring(temp.length() - 3);
        Moisty.price = Integer.parseInt(last3);
        Moisty.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
//        System.out.println(Moisty.name);
//        System.out.println(Moisty.price);

        Moisturizers Moisty1 = new Moisturizers();
        Moisty1.name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[1]")).getText();
        String temp1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[2]")).getText();
        String last31 = temp1.substring(temp1.length() - 3);
        Moisty1.price = Integer.parseInt(last31);
        Moisty1.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button"));
//        System.out.println(Moisty1.name);
//        System.out.println(Moisty1.price);

        Moisturizers Moisty2 = new Moisturizers();
        Moisty2.name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[1]")).getText();
        String temp2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[2]")).getText();
        String last32 = temp2.substring(temp2.length() - 3);
        Moisty2.price = Integer.parseInt(last32);
        Moisty2.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/button"));
//        System.out.println(Moisty2.name);
//        System.out.println(Moisty2.price);

        Moisturizers Moisty3 = new Moisturizers();
        Moisty3.name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[1]")).getText();
        String temp3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[2]")).getText();
        String last33 = temp3.substring(temp3.length() - 3);
        Moisty3.price = Integer.parseInt(last33);
        Moisty3.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/button"));
//        System.out.println(Moisty3.name);
//        System.out.println(Moisty3.price);

        Moisturizers Moisty4 = new Moisturizers();
        Moisty4.name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[1]")).getText();
        String temp4 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[2]")).getText();
        String last34 = temp4.substring(temp4.length() - 3);
        Moisty4.price = Integer.parseInt(last34);
        Moisty4.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
//        System.out.println(Moisty4.name);
//        System.out.println(Moisty4.price);

        Moisturizers Moisty5 = new Moisturizers();
        Moisty5.name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[1]")).getText();
        String temp5 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[2]")).getText();
        String last35 = temp5.substring(temp5.length() - 3);
        Moisty5.price = Integer.parseInt(last35);
        Moisty5.Add_btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/button"));
//        System.out.println(Moisty5.name);
//        System.out.println(Moisty5.price);

        int CounterALOE = 0;
        int CounterAlmond=0;


        Moisturizers[] MOI = new Moisturizers[6];
        MOI[0] = Moisty;
        MOI[1] = Moisty1;
        MOI[2] = Moisty2;
        MOI[3] = Moisty3;
        MOI[4] = Moisty4;
        MOI[5] = Moisty5;

        for (int i = 0; i <= MOI.length - 1; i++) {
            if (MOI[i].name.contains("Aloe")) {
                System.out.println("this is MOI[" +i+ "]" +" array " + MOI[i].name);
                if (i <= 4) {
                    if (MOI[i].price < MOI[i + 1].price) {
                        if (driver.findElement(By.xpath("//*[@id=\"cart\"]")).getText().equals("Empty") ||
                                driver.findElement(By.xpath("//*[@id=\"cart\"]")).getText().equals("1 item(s)")) {
                            if (CounterALOE==0){
                                MOI[i].Add_btn.click();
                                CounterALOE++;
                            }
                        }
                    }
                }
            }
            else{
                if (MOI[i].name.contains("Almond") || MOI[i].name.contains("almond")) {
                    System.out.println("this is MOI["+i+"]"+" array " + MOI[i].name);
                    if (i <=4) {
                        if (MOI[i].price < MOI[i + 1].price) {
                            if (driver.findElement(By.xpath("//*[@id=\"cart\"]")).getText().equals("Empty") ||
                                    driver.findElement(By.xpath("//*[@id=\"cart\"]")).getText().equals("1 item(s)")) {
                                if (CounterAlmond==0){
                                    MOI[i].Add_btn.click();
                                    CounterAlmond++;
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}











