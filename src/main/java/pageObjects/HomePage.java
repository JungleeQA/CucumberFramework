package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void perform_Search(String search) {
		String endPoint = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
		driver.navigate().to(endPoint + "/?s=" + search + "&post_type=product");
	}

	public void navigateTo_HomePage() {
		String endPoint = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
		driver.get(endPoint);
	}

}