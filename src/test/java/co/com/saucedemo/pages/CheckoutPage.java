package co.com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends PageObject {

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "finish")
    WebElement finishButton;

    @FindBy(css = ".complete-header")
    WebElement confirmationText;

    public void fillCheckoutForm(String name, String last, String code) {
        firstName.sendKeys(name);
        lastName.sendKeys(last);
        postalCode.sendKeys(code);
        continueButton.click();
        finishButton.click();
    }

    public String getConfirmationMessage() {
        return confirmationText.getText();
    }
}
