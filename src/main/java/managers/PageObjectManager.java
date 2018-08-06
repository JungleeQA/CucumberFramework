package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
//import pageObjects.ConfirmationPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class PageObjectManager {

	private WebDriver driver;

	private ProductListingPage productListingPage;

	private CartPage cartPage;

	private HomePage homePage;

	private CheckoutPage checkoutPage;

	// private ConfirmationPage confirmationPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;

	}

	public ProductListingPage getProductListingPage() {
		if (productListingPage == null) {
			productListingPage = new ProductListingPage(driver);
		}
		return productListingPage;

	}

	public CartPage getCartPage() {
		if (cartPage == null) {
			cartPage = new CartPage(driver);
		}
		return cartPage;
	}

	public CheckoutPage getCheckoutPage() {
		if (checkoutPage == null) {
			checkoutPage = new CheckoutPage(driver);
		}
		return checkoutPage;

	}
}