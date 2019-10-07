package COM_NOPCOMMERCE_POM_GROUP;

import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utils
{
    @BeforeTest
    public void openBrowser()
    {

    }
    @AfterTest
    public void tearDown(ITestResult result)
    {
        if(ITestResult.FAILURE==result.getStatus())
        {
            captureScreenShot(driver, result.getName());
        }
        driver.close();
    }
}
