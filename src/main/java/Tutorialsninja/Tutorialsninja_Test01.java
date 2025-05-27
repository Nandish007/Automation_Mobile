package Tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class Tutorialsninja_Test01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("//span[text()='My Account']")).click();

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        driver.findElement(By.name("firstname")).sendKeys("Automayion");

        driver.findElement(By.name("lastname")).sendKeys("Testing");

        Date date = new Date();
        String s = date.toString();
        String str = s.replaceAll(" ", "");
        String str1 = str.replaceAll(":", "");
        String NewEmail = str1 + "@gmail.com";
        System.out.println(NewEmail);

        driver.findElement(By.name("email")).sendKeys(NewEmail);

        driver.findElement(By.name("telephone")).sendKeys("1234567890");

        driver.findElement(By.name("password")).sendKeys("Testing12345");

        driver.findElement(By.name("confirm")).sendKeys("Testing12345");

        driver.findElement(By.name("agree")).click();

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.findElement(By.xpath("//a[text()='Continue']")).click();

    }

}
