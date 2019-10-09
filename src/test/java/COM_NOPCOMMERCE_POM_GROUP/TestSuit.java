package COM_NOPCOMMERCE_POM_GROUP;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ReferProduct referProduct = new ReferProduct();
    ReferProductResultPage referProductResultPage = new ReferProductResultPage();

    @Test
    public void userShouldAbleToRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registrationResultPage.verifyUserIsOnRegistrationPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        registrationResultPage.verifyUserIsOnHomePage();
    }
    @Test
    public void userShouldAbleToReferProductToFriend()
    {
        homePage.clickOnRegisterButton();
        registrationResultPage.verifyUserIsOnRegistrationPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        registrationResultPage.verifyUserIsOnHomePage();
        homePage.clickOnFeaturedProductMacBookPro();
        referProductResultPage.verifyUserIsOnAppleMacBookProPage();
        referProduct.referProductToFriend();
        referProductResultPage.verifyEmailHasBeenSentSuccessfully();
    }
}