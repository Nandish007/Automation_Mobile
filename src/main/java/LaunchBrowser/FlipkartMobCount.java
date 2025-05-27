package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class FlipkartMobCount {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max");

        try {

        driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

            List<WebElement> Ele=driver.findElements(By.className("KzDlHZ"));

            int Count=Ele.size();
            System.out.println("Total number of phones in 1st page is: "+Count);

            for(WebElement C:Ele)
            {
                System.out.println(C.getText());
            }
        } catch(Exception e) {
        }
            driver.findElement(By.xpath("//a[@class='_9QVEpD']")).click();

            List<WebElement> elementList= driver.findElements(By.className("KzDlHZ"));

            int count=elementList.size();
            System.out.println("Total number of phones in 2nd page is: "+count);

            for(WebElement c:elementList)
            {
                System.out.println(c.getText());
            }
        driver.close();
        }
}

