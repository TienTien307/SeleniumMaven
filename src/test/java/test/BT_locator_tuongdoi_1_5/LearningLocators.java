package test.BT_locator_tuongdoi_1_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class LearningLocators {
    public static class login {
        static String email_input = "//input[@id='email']";
        static String password_input = "//input[@id='password']";
        static String remember_checkbox = "//label[normalize-space()='Remember me']";
        static String btn_login = "//button[normalize-space()='Login']";
        static String forgot_pw = "//a[normalize-space()='Forgot Password?']";
    }
    public static class Customer{
        static String menu_Customer = "//span[normalize-space()='Customers']";
        static String create_Customer = "//a[normalize-space()='New Customer']";
        static String Company = "//input[@id = 'company']";
        static String VAT = "//input[@id = 'vat']";
        static String Phone = "//input[@id = 'phonenumber']";
        static String Website = "//input[@id = 'website']";
        static String Groups = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/select";
//        static String Groups_option = "//a[@id='bs-select-1-0']";
        static String Currency  = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[1]/div/div/select";
//        static String Currency_option  = "//span[contain@text(),'VNĐ']";
        static String Language = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div/select";
//        static String Languge_option = "//span[contain@text(),'Vietnamese']";
        static String Address = "//textarea[@id='address']";
        static String City = "//input[@id='city']";
        static String State = "//input[@id='state']";
        static String ZipCode = "//input[@id='zip']";
        static String Country = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[12]/div/select";
//        static String Country_option = "//span[normalize-space()='Vietnam']";
        static String Save_and_create = "//button[normalize-space()='Save and create contact']";
        static String Save = "//button[@class='btn btn-primary only-save customer-form-submiter']";
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
        WebElement emailinput = driver.findElement(By.xpath(login.email_input));
        emailinput.sendKeys("admin@example.com");
        Thread.sleep(1000);
        WebElement passwordinput = driver.findElement(By.xpath(login.password_input));
        passwordinput.sendKeys("123456");
        Thread.sleep(1000);
        WebElement remembercheck = driver.findElement(By.xpath(login.remember_checkbox));
        remembercheck.click();
        Thread.sleep(1000);
        WebElement btnlogin = driver.findElement(By.xpath(login.btn_login));
        btnlogin.click();

        //customer
        WebElement menuCustomer = driver.findElement(By.xpath(Customer.menu_Customer));
        menuCustomer.click();
        Thread.sleep(1000);
        WebElement createCustomer = driver.findElement(By.xpath(Customer.create_Customer));
        createCustomer.click();
        Thread.sleep(1000);
        WebElement company = driver.findElement(By.xpath(Customer.Company));
        company.sendKeys("Padi");
        Thread.sleep(1000);
        WebElement vat = driver.findElement(By.xpath(Customer.VAT));
        vat.sendKeys("10101010");
        Thread.sleep(1000);
        WebElement phone = driver.findElement(By.xpath(Customer.Phone));
        phone.sendKeys("0123456789");
        Thread.sleep(1000);
        WebElement web = driver.findElement(By.xpath(Customer.Website));
        web.sendKeys("https://crm.anhtester.com/admin/clients/client");
        Thread.sleep(1000);
        //
        WebElement group = driver.findElement(By.xpath(Customer.Groups));
        Select select = new Select(group);
        select.selectByIndex(2);

        WebElement currency = driver.findElement(By.xpath(Customer.Currency));
        Select select1 = new Select(currency);
        select1.selectByIndex(1);

        WebElement language = driver.findElement(By.xpath(Customer.Language));
        Select select3 = new Select(language);
        select3.selectByVisibleText("Vietnamese");

        Thread.sleep(1000);
        WebElement address = driver.findElement(By.xpath(Customer.Address));
        address.sendKeys("VTP");
        Thread.sleep(1000);
        WebElement city = driver.findElement(By.xpath(Customer.City));
        city.sendKeys("HN");
        Thread.sleep(1000);
        WebElement state = driver.findElement(By.xpath(Customer.State));
        state.sendKeys("aaaa");
        Thread.sleep(1000);
        WebElement zipcode = driver.findElement(By.xpath(Customer.ZipCode));
        zipcode.sendKeys("10000");
        Thread.sleep(1000);
        WebElement country = driver.findElement(By.xpath(Customer.Country));
        Select select4 = new Select(country);
        select4.selectByVisibleText("Vietnam");
        Thread.sleep(1000);

        WebElement save = driver.findElement(By.xpath(Customer.Save));
        save.click();


    }
}
