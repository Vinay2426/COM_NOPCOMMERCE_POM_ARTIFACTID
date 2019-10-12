package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProductResultPage extends Utils
{
    private By _macBookProPage = By.xpath("//h1[@itemprop='name']");
    private By _emailAFriendPage = By.xpath("//h1['Email a friend']");
    private By _emailSuccessfulMessage = By.xpath("//div[@class='result']");
    private By _emailErrorMessageIfTriesWithoutRegistration = By.xpath("//span[@id='YourEmailAddress-error']");

    public void verifyUserIsOnAppleMacBookProPage()
    {
        Assert.assertEquals(getTextReturn(_macBookProPage),"Apple MacBook Pro 13-inch");
    }

    public void verifyUserIsOnEmailAFriendPage()
    {
        Assert.assertEquals(getTextReturn(_emailAFriendPage),"Email a friend");
    }

    public void verifyEmailHasBeenSentSuccessfully()
    {
        Assert.assertEquals(getTextReturn(_emailSuccessfulMessage),"Your message has been sent.");
    }
    public void verifyUserShouldNotAbleToSendEmailWithoutRegistration()
    {
        Assert.assertEquals(getTextReturn(_emailErrorMessageIfTriesWithoutRegistration),"Enter your email");
    }
}
