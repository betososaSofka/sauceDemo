package co.com.saucedemo.stepdefinitions;

import co.com.saucedemo.pages.*;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

public class CompraSteps {

    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Given("inicio sesión con el usuario {string} y la contraseña {string}")
    public void login(String username, String password) {
        loginPage.openLoginPage();
        loginPage.login(username, password);
    }

    @When("agrego dos productos al carrito")
    public void addTwoProductsToCart() {
        productPage.addTwoProductsToCart();
    }

    @When("visualizo el carrito")
    public void viewCart() {
        productPage.viewCart();
    }

    @When("completo el formulario de compra con nombre {string}, apellido {string} y dirección {string}")
    public void completePurchaseForm(String nombre, String apellido, String dirección) {
        cartPage.proceedToCheckout();
        checkoutPage.fillCheckoutForm(nombre, apellido, dirección);
    }

    @Then("debería ver el mensaje de confirmación {string}")
    public void verifyConfirmationMessage(String message) {
        assertEquals(message, checkoutPage.getConfirmationMessage());
    }
}