package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils
{
    LoadProps loadProps = new LoadProps();

    public void setUpBrowser()
    {
        String browser = loadProps.getProperty("browser");
        //String setUpBrowser = System.getProperty("setUpBrowser");
        if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            //System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
            //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("disable-infobars");
            //options.addArguments("--disable-extensions");
            //options.addArguments("disable-setUpBrowser-side-navigation");
            //options.addArguments("--incognito");
            //options.addArguments("--disable-blink-feature=BlockCredentialedSubresources");
            //driver = new ChromeDriver(options);
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");

            driver = new InternetExplorerDriver();
        }
        else
            {
            System.out.println("Browser name is empty or typed wrong : " + browser);
            }
    }
}