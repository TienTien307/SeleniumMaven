package test.BT_locator_tuongdoi_6_10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Locators {
    public static class login2 {
        static String email_input = "//input[@id='email']";
        static String password_input = "//input[@id='password']";
        static String remember_checkbox = "//label[normalize-space()='Remember me']";
        static String btn_login = "//button[normalize-space()='Login']";
        static String forgot_pw = "//a[normalize-space()='Forgot Password?']";
    }
    public static class project{
        static String menu_project = "//li[@class='menu-item-projects active']/descendant::span";
        static String create_project = "//a[normalize-space()='New Project']";
        static String project_name = "//label[@for='name']/following-sibling::input";
        static String customer = "//label[@for='clientid']/following-sibling::div/select[@id='clientid']";

    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);

        //login
        WebElement emailinput = driver.findElement(By.xpath(Locators.login2.email_input));
        emailinput.sendKeys("admin@example.com");
        Thread.sleep(1000);
        WebElement passwordinput = driver.findElement(By.xpath(Locators.login2.password_input));
        passwordinput.sendKeys("123456");
        Thread.sleep(1000);
        WebElement remembercheck = driver.findElement(By.xpath(Locators.login2.remember_checkbox));
        remembercheck.click();
        Thread.sleep(1000);
        WebElement btnlogin = driver.findElement(By.xpath(Locators.login2.btn_login));
        btnlogin.click();


//      project
        WebElement menuproject = driver.findElement(By.xpath(project.menu_project));
        menuproject.click();
        Thread.sleep(1000);
        WebElement createproject = driver.findElement(By.xpath(project.create_project));
        createproject.click();
        Thread.sleep(1000);

        WebElement customer = driver.findElement(By.xpath(project.customer));
        Select select = new Select(customer);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/input")).sendKeys("t");
        select.selectByIndex(2);

    }
}
