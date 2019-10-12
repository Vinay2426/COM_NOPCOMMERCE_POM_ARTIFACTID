package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingShoesResultPage extends Utils
{
    private By _successfulShoppingMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public void verifyUserSeeSuccessfulOrderMessage()
    {
        Assert.assertEquals(getTextReturn(_successfulShoppingMessage),"Your order has been successfully processed!");
    }
}
