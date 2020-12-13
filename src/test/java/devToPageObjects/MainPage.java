package devToPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class MainPage {

    WebDriver driver;
    String url = "https://dev.to";

    @FindBy(xpath = "//a[@href='/top/week']")
    WebElement weekBtn;

    @FindBy(partialLinkText = "Podcasts")
    WebElement podckastBtn;

    public  MainPage(WebDriver driver){
        this.driver = driver;
        this.driver.get(url);
        PageFactory.initElements(driver, this);

    }

    public void clickWeekButton() {
        weekBtn.click();
    }

    public void clickPodcastButton() {
        podckastBtn.click();
    }
}
