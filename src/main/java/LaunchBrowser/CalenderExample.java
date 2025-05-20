package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalenderExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='text']")).click();

        List<WebElement> ele = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for (WebElement E : ele) {
            String text = E.getText();
            if (text.equals("20")) {
                E.click();

            }
        }
    }
}
