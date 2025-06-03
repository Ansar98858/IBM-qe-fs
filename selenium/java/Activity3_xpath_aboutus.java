import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_xpath_aboutus{
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net");

        // Get the title of the homepage
        System.out.println("Home Page Title: " + driver.getTitle());

        // Click on the "About Us" link using XPath
        driver.findElement(By.xpath("//a[text()='About Us']")).click();
        

        // Get and print the About Us page title
        String aboutTitle = driver.getTitle();
        System.out.println("About Us Page Title: " + aboutTitle);

        // Close the browser
        driver.quit();
    }
}
