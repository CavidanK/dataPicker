import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {

    @Test
    public void dataPicker() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

        WebElement dataInput = driver.findElement(By.id("datePickerMonthYearInput"));
        dataInput.click();

        WebElement aySec = driver.findElement(By.className("react-datepicker__month-select"));
        aySec.sendKeys("Ju");

        WebElement ilSec = driver.findElement(By.className("react-datepicker__year-select"));
        ilSec.sendKeys("1998");

        WebElement gunSec = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and contains(@class, 'react-datepicker__day--022') and text()='22']\n"));
        gunSec.click();

        String dataSec = dataInput.getDomAttribute("value");
        System.out.println("data vaxti" + dataSec);

        Thread.sleep(2000);


        WebElement timeSec = driver.findElement(By.id("dateAndTimePickerInput"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", timeSec);
        timeSec.click();

        WebElement oxSec = driver.findElement(By.className("react-datepicker__month-read-view--down-arrow"));
        oxSec.click();

        WebElement aySec2 = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-option') and text()='June']\n"));
        aySec2.click();

        WebElement ilSec2 = driver.findElement(By.className("react-datepicker__year-read-view--down-arrow"));
        ilSec2.click();

        WebElement asagiOx = driver.findElement(By.xpath("//a[contains(@class,'react-datepicker__navigation--years-previous')]"));

        for (int i = 0; i<22; i++)
        asagiOx.click();
        Thread.sleep(500);

        WebElement il1998 = driver.findElement(By.xpath("//div[@class='react-datepicker__year-option' and text()='1998']"));
        il1998.click();

        WebElement vaxtSec = driver.findElement(By.xpath("//li[contains(@class,'react-datepicker__time-list-item') and text()='15:00']"));
        vaxtSec.click();





    }
}