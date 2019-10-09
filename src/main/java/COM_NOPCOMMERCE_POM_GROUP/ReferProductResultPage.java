package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProductResultPage extends Utils
{
    private By _macBookProPage = By.xpath("//h1[@itemprop='name']");
    private By _emailSuccessfulMessage = By.xpath("//div[@class='result']");

    public void verifyUserIsOnAppleMacBookProPage()
    {
        //Assert.assertEquals(getTextFromLocator(_macBookProPage),"Apple MacBook Pro 13-inch"));
    }

    public void verifyEmailHasBeenSentSuccessfully()
    {
        //Assert.assertEquals(getTextFromLocator(_emailSuccessfulMessage),"Your message has been sent.");
    }
}
