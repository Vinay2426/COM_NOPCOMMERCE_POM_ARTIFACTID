package COM_NOPCOMMERCE_POM_GROUP;

import cucumber.api.Scenario;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeTest
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterTest
    public void tearDown()//(ITestResult result)
    {
//        if(ITestResult.FAILURE==result.getStatus())
//        {
//            captureScreenShot(driver, result.getName());
//        }
        driver.quit();
    }
}
