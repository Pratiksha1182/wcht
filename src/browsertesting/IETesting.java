package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IETesting {
    public static void main(String[] args) {
        String baseURL = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("My web page title is  " + title);
        driver.quit();
    }
}

