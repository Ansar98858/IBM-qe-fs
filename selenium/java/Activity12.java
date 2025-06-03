/*import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.training-support.net/webelements/dynamic-content");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the button and click it
        driver.findElement(By.id("genButton")).click();
        // Wait for the word to appear
        if (wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"))) {
            // Print the text to console
            System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
        }
        // Close the browser
        driver.quit();
    }
}*/


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity12 {
    public static void main(String[] args) {
        // Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Set explicit wait (10 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to the web page
        driver.get("https://www.training-support.net/webelements/dynamic-content");

        // Print the page title
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        // Click the "Generate New Word" button
        By buttonLocator = By.id("genButton");
        driver.findElement(buttonLocator).click();

        // Wait until the word "release" is displayed in the element
        By wordLocator = By.id("word");
        boolean wordDisplayed = wait.until(ExpectedConditions.textToBePresentInElementLocated(wordLocator, "release"));

        // If word is present, print it
        if (wordDisplayed) {
            String word = driver.findElement(wordLocator).getText();
            System.out.println("Word found: " + word);
        }

        // Close the browser
        driver.quit();
    }
}

