package COM_NOPCOMMERCE_POM_GROUP;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProps loadProps = new LoadProps();

    private By _firstName = By.id("FirstName");
    private By _lastName = By.xpath("//input[@name='LastName']");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.name("register-button");
    private By _clickContinue = By.xpath("//input[@name='register-continue']");

    private static String timeStamp = longDateStamp();

    public void userEntersRegistrationDetails()
    {
        sendText(_firstName,loadProps.getProperty("firstName"));
        sendText(_lastName,loadProps.getProperty("lastName"));
        sendText(_email, "testvenus"+timeStamp+"@rahu.com");
        sendText(_password,"alpertonhouse");
        sendText(_confirmPassword,"alpertonhouse");
        clickOnElement(_registerButton);
        clickOnElement(_clickContinue);
    }
}
