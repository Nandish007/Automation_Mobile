package LaunchBrowser;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class FacebookLogin {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

       driver.findElement(By.linkText("Create new account")).click();

           driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nandish");

           driver.findElement(By.name("lastname")).sendKeys("N");

           driver.findElement(By.name("birthday_day")).sendKeys("12");

           driver.findElement(By.id("month")).sendKeys("Jul");

           driver.findElement(By.id("year")).sendKeys("1998");

           driver.findElement(By.xpath("//input[@value='2']")).click();

           driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nandu120798@gmail.com");

           driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nandu@123");

           driver.findElement(By.xpath("//button[@type='submit']")).click();

        TakesScreenshot TS= (TakesScreenshot)driver;
        File file=TS.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("D:\\Screenshots\\Facebook.png"));

           Thread.sleep(10000);

           driver.navigate().back();

           driver.findElement(By.id("email")).sendKeys("nandu120798@gmail.com");

           driver.findElement(By.id("pass")).sendKeys("Nandu@123");

           driver.findElement(By.name("login")).click();

           driver.close();

    }
}