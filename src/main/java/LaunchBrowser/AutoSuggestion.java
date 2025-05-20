package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestion {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        element.sendKeys("selenium");
        element.click();

        List<WebElement> elementList = driver.findElements(By.xpath("//ul/li[@class='sbct PZPZlf']"));

        for (WebElement ele : elementList)
        {
            if(ele.getText().trim().equalsIgnoreCase("selenium testing"));
            {
                ele.click();
            }
        }
}
}
