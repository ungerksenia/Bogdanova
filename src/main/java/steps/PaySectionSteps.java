package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PaySectionPage;

import java.time.Duration;

public class PaySectionSteps {

    private final PaySectionPage paySectionPage;
    private final WebDriverWait wait;

    public PaySectionSteps(WebDriver driver) {
        this.paySectionPage = PageFactory.initElements(driver, PaySectionPage.class );
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickSelectWrapperButton() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getSelectWrapperButton())).click();
        wait.until(ExpectedConditions.attributeContains(
                By.xpath("//div[contains(@class,'select__wrapper')]"), "class", "opened"));    }

    //Услуги связи
    public void clickCommunicationServices() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getCommunicationServices())).click();
    }
    public String getConnectionPhoneText() {
        return paySectionPage.getConnectionPhoneText().getAttribute("placeholder");
    }
    public  String getConnectionSumText() {
        return paySectionPage.getConnectionSumText().getAttribute("placeholder");
    }
    public String getConnectionEmailText() {
        return paySectionPage.getConnectionEmailText().getAttribute("placeholder");
    }

    //Домашний интернет
    public void clickHomeInternet() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getHomeInternet())).click();
    }
    public String getInternetPhoneText() {
        return paySectionPage.getInternetPhoneText().getAttribute("placeholder");
    }
    public String getInternetSumText() {
        return paySectionPage.getInternetSumText().getAttribute("placeholder");
    }
    public String getInternetEmailText() {
        return paySectionPage.getInternetEmailText().getAttribute("placeholder");
    }

    //Рассрочка
    public void clickInstalment() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getInstalment())).click();
    }
    public  String getScoreInstalmentText() {
        return paySectionPage.getScoreInstalmentText().getAttribute("placeholder");
    }
    public String getScoreInstalmentSumText() {
        return paySectionPage.getInstalmentSumText().getAttribute("placeholder");
    }
    public String getScoreInstalmentEmailText() {
        return paySectionPage.getInstalmentEmailText().getAttribute("placeholder");
    }

    //Задолженность
    public void clickArrears() {
        wait.until(ExpectedConditions.elementToBeClickable(paySectionPage.getArrears())).click();
    }
    public  String getScoreArrearsText() {
        return paySectionPage.getScoreArrearsText().getAttribute("placeholder");
    }
    public String getScoreArrearsSumText() {
        return paySectionPage.getArrearsSumText().getAttribute("placeholder");
    }
    public String getScoreArrearsEmailText() {
        return paySectionPage.getArrearsEmailText().getAttribute("placeholder");
    }
}
