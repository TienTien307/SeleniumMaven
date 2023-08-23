package test.BT_locator_tuyetdoi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.naming.ldap.LdapReferralException;
import java.time.Duration;

public class Project {
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

        //click projec
        driver.findElement(By.xpath("/html/body/aside/ul/li[8]/a/span")).click();
        Thread.sleep(1000);

        //click new project
        driver.findElement(By.linkText("New Project")).click();
        Thread.sleep(1000);

        //project name
        driver.findElement(By.id("name")).sendKeys("Auto");
        //customer
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[2]/div/button/div/div/div")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/input")).sendKeys("t");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/ul/li[1]/a/span[2]")).click();
        Thread.sleep(1000);
        //Billing Type
        Select dropdown1 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[5]/div[1]/div/div[2]/select")));
        dropdown1.selectByIndex(1);
        //status
        Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[5]/div[2]/div/div[2]/select")));
        dropdown2.selectByVisibleText("In Progress");
        Thread.sleep(1000);
        //Total Rate
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[7]/div/input")).sendKeys("100");
        //Estimated Hours
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[9]/div[1]/div/input")).sendKeys("5");
        Thread.sleep(1000);
        //Members
        Select dropdown3 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[9]/div[2]/div/div/select")));
        dropdown3.selectByVisibleText("Anh Tester");
        Thread.sleep(1000);
        //Start Date
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[10]/div[1]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[10]/div[1]/div/div/input")).sendKeys("20-07-2023");
        //Deadline
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[10]/div[2]/div/div/input")).sendKeys("21-07-2023");
        //tags
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[11]/ul/li/input")).sendKeys("Java");
        Thread.sleep(1000);
        //checkbox
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[13]/label")).click();
        Thread.sleep(1000);
        //Save
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[2]/button")).click();
        Thread.sleep(1000);

    }
}
