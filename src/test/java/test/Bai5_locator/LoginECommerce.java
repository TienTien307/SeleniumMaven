package test.Bai5_locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginECommerce {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);

        //Điền email - tìm locator theo ID
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        
        //Điền pw - tìm locator theo Name
        driver.findElement(By.name("password")).sendKeys("123456");

        //Click link Forgot pw?
//        driver.findElement(By.linkText("Forgot password ?")).click();

        //Click link Forgot
        driver.findElement(By.partialLinkText("Forgot")).click();

        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
