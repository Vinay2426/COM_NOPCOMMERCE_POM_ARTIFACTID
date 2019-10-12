package COM_NOPCOMMERCE_POM_GROUP;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs
{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Given("^user is on register page$")
    public void userIsOnRegisterPage()
    {
        homePage.clickOnRegisterButton();
        registrationResultPage.verifyUserIsOnRegistrationPage();
    }

    @When("^user fill all the mandatory fields$")
    public void userFillAllTheMandatoryFields()
    {
        registrationPage.userEntersRegistrationDetails();
    }

    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully()
    {
        //registrationResultPage.verifyUserRegisteredSuccessfully();
    }
}
