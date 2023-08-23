package test.BT_locator_tuyetdoi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class New_Customer {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);

        //login
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();
        Thread.sleep(2000);

        //click customer
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();
        Thread.sleep(1000);

        //click new customer
        driver.findElement(By.linkText("New Customer")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("company")).sendKeys("Java");
        driver.findElement(By.name("vat")).sendKeys("11111");
        driver.findElement(By.id("phonenumber")).sendKeys("0123456789");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[5]/input")).sendKeys("https://crm.anhtester.com/");
        Thread.sleep(1000);
        //Select dropdown lits
        Select dropdown1 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/select")));
        dropdown1.selectByIndex(3);
        Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[1]/div/div/select")));
        dropdown2.selectByVisibleText("USD");
        Select dropdown3 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div/select")));
        dropdown3.selectByVisibleText("French");
        Thread.sleep(1000);
        driver.findElement(By.id("address")).sendKeys("VTP");
        driver.findElement(By.id("city")).sendKeys("HaNoi");
        driver.findElement(By.id("state")).sendKeys("XXX");
        driver.findElement(By.id("zip")).sendKeys("10000");

        Select dropdown4 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[12]/div/select")));
        dropdown4.selectByVisibleText("Vietnam");

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/button[2]")).click();
    }
}
