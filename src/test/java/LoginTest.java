import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class LoginTest {

    @Test
    public void loginTest()  throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        try {


            driver.get("http://localhost/OpenCart/");

            Thread.sleep(500);

            driver.manage().window().maximize();


            driver.findElement(By.linkText("My Account")).click();
            driver.findElement(By.linkText("Login")).click();
            driver.findElement(By.id("input-email")).sendKeys("email@email.com");
            driver.findElement(By.id("input-password")).sendKeys("password");
//            driver.findElement(By.linkText("Login")).click();
            driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();

            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e);
        }

//        driver.close();
    }
}
