package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FlipkartAddingMob {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        element.sendKeys("Flipkart");
        element.click();

        List<WebElement> elementList = driver.findElements(By.xpath("//ul/li[@class='sbct']"));

        for (WebElement ele : elementList) {
            if (ele.getText().equalsIgnoreCase("flipkart login")) ;
            {
                ele.click();
                break;
            }
        }
//driver.close();
    }
}

