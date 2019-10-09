package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils
{
    private By _registerPage = By.xpath("//h1['Register']");
    private By _registerSuccessMessage = By.xpath("//div[@class='result']");
    private By _homePage = By.xpath("//img[@alt='nopCommerce demo store']");

    public void verifyUserIsOnRegistrationPage()
    {
        //Assert.assertEquals(getTextFromLocator(_registerPage),"Register");
    }
    public void verifyUserSeeRegistrationSuccessMessage()
    {
        //Assert.assertEquals(getTextFromLocator(_registerSuccessMessage), "Your registration completed");
    }
    public void verifyUserIsOnHomePage()
    {
        //Assert.assertEquals(getTextFromLocator(_homePage),"nopCommerce demo store");
    }

}
