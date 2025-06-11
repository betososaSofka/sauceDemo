package co.com.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends PageObject {

    @FindBy(css = ".inventory_item button")
    List<WebElement> addButtons;

    @FindBy(id = "shopping_cart_container")
    WebElement cartButton;

    public void addTwoProductsToCart() {
        addButtons.get(0).click();
        addButtons.get(1).click();
    }

    public void viewCart() {
        cartButton.click();
    }
}

