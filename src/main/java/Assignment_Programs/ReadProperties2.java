package Assignment_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties2 {

    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+ File.separator+"configs.properties";

        System.out.println(path);
        FileInputStream fis=new FileInputStream(path);
        Properties properties =new Properties();
        properties.load(fis);
         String url= properties.getProperty("url");

         System.out.println(url);
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\Automation_Mobile\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.linkedin.com/");

    }
}
