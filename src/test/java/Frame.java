import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

    @Test
    public void frame(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");

        WebElement frame1 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Frame 1 " + frame1.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        WebElement frame2 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Frame 1 " + frame2.getText());

        driver.switchTo().defaultContent();
        driver.quit();



    }


}
