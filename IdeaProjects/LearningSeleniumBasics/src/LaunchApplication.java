import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //1. open the browser

      System.setProperty("webdriver.chrome.driver","/Users/tammrmakar/IdeaProjects/LearningSeleniumBasics/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

    }
}