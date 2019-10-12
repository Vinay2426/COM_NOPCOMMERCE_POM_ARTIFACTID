package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils
{
    private By _registerPage = By.xpath("//h1['Register']");
    private By _homePageWelcomeMsg = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    private By _registerSuccessMessage = By.xpath("//div[@class='result']");

    public void verifyUserIsOnRegistrationPage()
    {
        Assert.assertEquals(getTextReturn(_registerPage),"Register");
    }
    public void verifyUserIsOnHomePage()
    {
        Assert.assertEquals(getTextReturn(_homePageWelcomeMsg),"Welcome to our store");
    }
//    public void verifyUserRegisteredSuccessfully()
//    {
//        Assert.assertEquals(getTextReturn(_registerSuccessMessage),"Your registration completed");
//    }

}
