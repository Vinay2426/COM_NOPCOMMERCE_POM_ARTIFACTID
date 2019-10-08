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

    private static String timeStamp = longDateStamp();

    public void verifyUserIsOnRegistrationPage()
    {
        //assertURL("register");
    }
}
