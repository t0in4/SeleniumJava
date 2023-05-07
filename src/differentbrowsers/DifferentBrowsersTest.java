package differentbrowsers;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DifferentBrowsersTest {


    /*@Test
    public void testInIE() throws Exception {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            WebDriver driver = new InternetExplorerDriver();
            driver.get("http://youtube.com");
            Thread.sleep(1000);
            driver.quit();
        }
    }*/

    @Test
    public void testInFirefox() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://youtube.com");
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void testInChrome() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        Thread.sleep(1000);
        driver.quit();
    }


    /*@Test
    public void testInEdge() throws Exception {
        if (System.getProperty("os.name").equals("Windows 10")) {
            String edgeDriverPath = "C:\\agileway\\books\\SeleniumRecipes-Java\\recipes\\MicrosoftWebDriver.exe";
            System.setProperty("webdriver.edge.driver", edgeDriverPath);
            WebDriver driver = new EdgeDriver();
            driver.get("http://youtube.com");
            Thread.sleep(1000);
            driver.quit();
        } else {
            System.out.println("Edge is not available on " + System.getProperty("os.name"));
        }
    }*/
}
