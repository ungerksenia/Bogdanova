package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class PaySectionPage {

    @FindBy(xpath = "//button[@class='select__header']")
    private WebElement selectWrapperButton;

    //Услуги связи
    @FindBy(xpath = "//div[@class='select__wrapper opened']//p[text()='Услуги связи']")
    private WebElement communicationServices;
    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement connectionPhoneText;
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement connectionSumText;
    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement connectionEmailText;

    //Домашний интернет
    @FindBy(xpath = "//div[@class='select__wrapper opened']//p[text()='Домашний интернет']")
    private WebElement homeInternet;
    @FindBy(xpath = "//input[@id='internet-phone']")
    private WebElement internetPhoneText;
    @FindBy(xpath = "//input[@id='internet-sum']")
    private WebElement internetSumText;
    @FindBy(xpath = "//input[@id='internet-email']")
    private WebElement internetEmailText;

    //Рассрочка
    @FindBy(xpath = "//div[@class='select__wrapper opened']//p[text()='Рассрочка']")
    private WebElement instalment;
    @FindBy(xpath = "//input[@id='score-instalment']")
    private WebElement scoreInstalmentText;
    @FindBy(xpath = "//input[@id='instalment-sum']")
    private WebElement instalmentSumText;
    @FindBy(xpath = "//input[@id='instalment-email']")
    private WebElement instalmentEmailText;

    //Задолженность
    @FindBy(xpath = "//div[@class='select__wrapper opened']//p[text()='Задолженность']")
    private WebElement arrears;
    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement scoreArrearsText;
    @FindBy(xpath = "//input[@id='arrears-sum']")
    private WebElement arrearsSumText;
    @FindBy(xpath = "//input[@id='arrears-email']")
    private WebElement arrearsEmailText;
}
