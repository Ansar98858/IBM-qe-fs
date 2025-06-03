import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Challenge_activity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("cheese\n");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'About') and contains(text(),'results')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Tools' or contains(text(),'Tools')]"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'About') and contains(text(),'results')]")));
        String results = driver.findElement(By.xpath("//div[contains(text(),'About') and contains(text(),'results')]")).getText();
        System.out.println("Results after clicking Tools: " + results);
        driver.quit();
    }
}