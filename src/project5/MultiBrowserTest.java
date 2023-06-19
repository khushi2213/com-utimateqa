package project5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {


    static String browser = "Firefox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //1. Setup multi browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid Browser name");
        }
        driver.get(baseUrl);

    }
}
