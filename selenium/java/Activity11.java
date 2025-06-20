import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {
    public static void main(String[] args) {
        // Driver object reference
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));

        // Open the browser
        driver.get("https://www.training-support.net/webelements/dynamic-controls");

        // Verify page title
        System.out.println("Page title is: " + driver.getTitle());

        // Find the checkbox and make sure it is visible
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox is visible before clicking the toggle? " + checkbox.isDisplayed());

        // Find the button to toggle it and click it
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Wait for it to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        // Check if it is visible
        System.out.println("Checkbox is visible after clicking the toggle? " + checkbox.isDisplayed());
        
        // Toggle the checkbox and click it
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        wait.until(ExpectedConditions.visibilityOf(checkbox)).click();
        // Check if it is selected
        System.out.println("Checkbox is selected? " + checkbox.isSelected());

        // Close the browser
        driver.quit();
    }
}

/*import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {
    public static void main(String[] args) {
        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // Wait object to handle dynamic elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        // Open the webpage
        driver.get("https://www.training-support.net/webelements/dynamic-controls");

        // Print page title
        System.out.println("pageTitle: " + driver.getTitle());

        // Locate the checkbox element
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox visible? " + checkbox.isDisplayed());

        // Click 'Toggle Checkbox' button to hide the checkbox
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();

        // Wait until the checkbox disappears
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        System.out.println("Checkbox is now hidden.");

        // Click 'Toggle Checkbox' again to bring it back
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();

        // Wait until the checkbox is visible and clickable
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));

        // Re-locate the checkbox (since it's been re-rendered)
        checkbox = driver.findElement(By.id("checkbox"));

        // Click the checkbox
        checkbox.click();

        // Check if checkbox is selected
        System.out.println("Checkbox selected? " + checkbox.isSelected());

        // Close the browser
        driver.quit();
    }
}*/

