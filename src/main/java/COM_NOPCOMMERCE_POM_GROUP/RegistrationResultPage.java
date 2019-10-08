package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils
{
    private By _registerSuccessMessage = By.xpath("//div[@class='result']");

    public void verifyUserSeeRegistrationSuccessMessage()
    {
//        assertURL("registerresult");
//        assertTextMessage("Your registration completed");
    }
}
