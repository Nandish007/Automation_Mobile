package Tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FormFilling_Test02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@class='card-up'])[2]")).click();

        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='header-wrapper']"));
        int count = ele.size();

        System.out.println(count);

        for (WebElement W : ele) {
            String Text = W.getText();
            System.out.println(Text);
        }

        WebElement element = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
        element.click();

        driver.findElement(By.id("firstName")).sendKeys("Nandish");

        driver.findElement(By.id("lastName")).sendKeys("N");

        driver.findElement(By.id("userEmail")).sendKeys("nandish234@gmail.com");

        driver.findElement(By.xpath("//label[text()='Male']")).click();

        driver.findElement(By.id("userNumber")).sendKeys("0123456789");

                driver.findElement(By.xpath("//label[text()='Sports']")).click();

        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("G:\\New folder\\sampleFile.jpeg");

        driver.findElement(By.id("currentAddress")).sendKeys("1st main 1st cross udayanagar bangalore 560016");

        driver.findElement(By.id("submit")).click();
    }

}