import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page title: " + driver.getTitle());

        // First check
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

        // Click the "Toggle Checkbox" button
        WebElement toggleBtn = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
        toggleBtn.click();

        
        // Re-locate checkbox and print status again
        checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Checkbox is displayed again: " + checkbox.isDisplayed());

        driver.quit();
    }
}
