package test.Bai5_locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginHRM {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rise.fairsketch.com/signin");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[1]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[1]/input")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[2]/input")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[2]/input")).sendKeys("riseDemo");
//        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/button")).click();


        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
