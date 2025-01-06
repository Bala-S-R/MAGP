package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FaqPage extends BaseClass {
    public WebDriver _driver;

    public FaqPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    private WebElement searchBar;

    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement search;

    @FindBy(xpath = "//button[text()='Q5: Is PM covers policy on gifts received from suppliers?']")
    private WebElement clickTextBox;

    @FindBy(xpath = "(//img[@src='/cancel-gray.svg'])[1]")
    private WebElement clickCrossbtn;

    @FindBy(xpath = "//img[@src='/MAGP/home/p1.png']")
    private WebElement clickProfileicon;

    @FindBy(xpath = "//h2[text()='FAQs']")
    private WebElement faqs;

    @FindBy(xpath = "//h2[text()='Have A Question? Solve your Doubts']")
    private WebElement solveyourdoubts;

    @FindBy(xpath = "//button[contains(.,'Q1:')]")
    private WebElement q1;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'edition of the Procurement')]")
    private WebElement answer1;

    @FindBy(xpath = "//button[contains(.,'Q2:')]")
    private WebElement q2;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Users can link to internal')]")
    private WebElement answer2;

    @FindBy(xpath = "//button[contains(.,'Q3:')]")
    private WebElement q3;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Any changes to the policies')]")
    private WebElement answer3;

    @FindBy(xpath = "//button[contains(.,'Q4:')]")
    private WebElement q4;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Quotation Document issues')] ")
    private WebElement answer4;

    @FindBy(xpath = "//button[contains(.,'Q5:')]")
    private WebElement q5;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Please refer to the MAHB’s Code of Ethic')]")
    private WebElement answer5;

    @FindBy(xpath = "//button[contains(.,'Q6:')]")
    private WebElement q6;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'SOP is detailing the internal process flow')]")
    private WebElement answer6;

    @FindBy(xpath = "//button[contains(.,'Q7:')]")
    private WebElement q7;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'GALOA and SOP are mentioned in general')]")
    private WebElement answer7;

    @FindBy(xpath = "//button[contains(.,'Q8:')]")
    private WebElement q8;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Tender advertisement is required for open tender type')]")
    private WebElement answer8;

    @FindBy(xpath = "//button[contains(.,'Q9:')]")
    private WebElement q9;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Superintending Officer (S.O.)’s request')]")
    private WebElement answer9;

    @FindBy(xpath = "//button[contains(.,'Q10:')]")
    private WebElement q10;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'maximum of tendering period is 4 weeks')]")
    private WebElement answer10;

    @FindBy(xpath = "//button[contains(.,'Q11:')]")
    private WebElement q11;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'PCD shall compile all queries from tenderer')]")
    private WebElement answer11;

    @FindBy(xpath = "//button[contains(.,'Q12:')]")
    private WebElement q12;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Head of Department PCD')]")
    private WebElement answer12;

    @FindBy(xpath = "//button[contains(.,'Q13:')]")
    private WebElement q13;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Tender Evaluation guidelines in the share point')]")
    private WebElement answer13;

    @FindBy(xpath = "//button[contains(.,'Q14:')]")
    private WebElement q14;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Users can link to Tender Evaluation')]")
    private WebElement answer14;

    @FindBy(xpath = "//button[contains(.,'Q15:')]")
    private WebElement q15;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'March and September')]")
    private WebElement answer15;

    @FindBy(xpath = "//button[contains(.,'Q16:')]")
    private WebElement q16;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'emailed to Vendor Management PCD.')]")
    private WebElement answer16;

    @FindBy(xpath = "//button[contains(.,'Q17:')]")
    private WebElement q17;

    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'the ePro User Access')]")
    private WebElement answer17;


    @FindBy(xpath = "//h2[@class='accordion-header']//button")
    private List<WebElement> faqList;

    public List<WebElement> getFaqList() {
        return faqList;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void globalSearchFAQ() {
        elementClick(getSearchBar());
        getSearchBar().sendKeys("epro");
    }

    public WebElement getSearch() {
        return search;
    }

    public void searchFAQ() {
        clickUsingJavaScript(getSearch());
        getSearch().sendKeys("gift");
        scrollPageToDown();
    }

    public WebElement getClickTextBox() {
        return clickTextBox;
    }

    public void clicktext() {
        waitForVisibility(By.xpath("//button[text()='Q5: Is PM covers policy on gifts received from suppliers?']"));
        clickUsingJavaScript(getClickTextBox());
        scrollPageToDown();
    }

    public void closetextbox() throws InterruptedException {
        Thread.sleep(3000);
        clickUsingJavaScript(getClickTextBox());
    }

    public WebElement getClickCrossbtn() {
        return clickCrossbtn;
    }

    public void crossbtn() {
        clickUsingJavaScript(getClickCrossbtn());
    }

    public WebElement getClickProfileicon() {
        return clickProfileicon;
    }

    public void profile() {
        clickUsingJavaScript(getClickProfileicon());
    }

    public WebElement getFaqs() {
        return faqs;
    }

    public void verifyfaq() {
        scrollToElement(getFaqs());
        Assert.assertTrue(getFaqs().isDisplayed());
    }

    public WebElement getSolveyourdoubts() {
        return solveyourdoubts;
    }

    public void verifydoubts() {
        Assert.assertTrue(getSolveyourdoubts().isDisplayed());
    }


    public WebElement getQ1() {
        return q1;
    }
    public void verifyquest1() {
        Assert.assertTrue(getQ1().isDisplayed());
    }
    public WebElement getAnswer1() {
        return answer1;
    }
    public void verifyans1() {
        Assert.assertTrue(getAnswer1().isDisplayed());
    }


    public WebElement getQ2() {
        return q2;
    }
    public void verifyquest2() {
        Assert.assertTrue(getQ2().isDisplayed());
    }
    public WebElement getAnswer2() {
        return answer2;
    }
    public void verifyans2() {
        Assert.assertTrue(getAnswer2().isDisplayed());
    }


    public WebElement getQ3() {
        return q3;
    }
    public void verifyquest3() {
        Assert.assertTrue(getQ3().isDisplayed());
    }
    public WebElement getAnswer3() {
        return answer3;
    }
    public void verifyans3() {
        Assert.assertTrue(getAnswer3().isDisplayed());
    }


    public WebElement getQ4() {
        return q4;
    }
    public void verifyquest4() {
        Assert.assertTrue(getQ4().isDisplayed());
    }
    public WebElement getAnswer4() {
        return answer4;
    }
    public void verifyans4() {
        Assert.assertTrue(getAnswer4().isDisplayed());
    }


    public WebElement getQ5() {
        return q5;
    }
    public void verifyquest5() {
        Assert.assertTrue(getQ5().isDisplayed());
    }
    public WebElement getAnswer5() {
        return answer5;
    }
    public void verifyans5() {
        Assert.assertTrue(getAnswer5().isDisplayed());
    }


    public WebElement getQ6() {
        return q6;
    }
    public void verifyquest6(){
        Assert.assertTrue(getQ6().isDisplayed());
    }
    public WebElement getAnswer6() {
        return answer6;
    }
    public void verifyans6(){
        Assert.assertTrue(getAnswer6().isDisplayed());
    }


    public WebElement getQ7() {
        return q7;
    }
    public void verifyquest7(){
        Assert.assertTrue(getQ7().isDisplayed());
    }
    public WebElement getAnswer7() {
        return answer7;
    }
    public void verifyans7(){
        Assert.assertTrue(getAnswer7().isDisplayed());
    }


    public WebElement getQ8() {
        return q8;
    }
    public void verifyquest8(){
        Assert.assertTrue(getQ8().isDisplayed());
    }
    public WebElement getAnswer8() {
        return answer8;
    }


    public WebElement getQ9() {
        return q9;
    }
    public void verifyquest9(){
        Assert.assertTrue(getQ8().isDisplayed());
    }
    public WebElement getAnswer9() {
        return answer9;
    }
    public void VerifyAnswer9(){
        Assert.assertTrue(getAnswer9().isDisplayed());
    }


    public WebElement getQ10() {
        return q10;
    }
    public void verifyquest10(){
        Assert.assertTrue(getQ10().isDisplayed());
    }
    public WebElement getAnswer10() {
        return answer10;
    }
    public void verifyAnswer10(){
        Assert.assertTrue(getAnswer10().isDisplayed());
    }


    public WebElement getQ11() {
        return q11;
    }
    public void verifyQuest11(){
        Assert.assertTrue(getQ11().isDisplayed());
    }
    public WebElement getAnswer11() {
        return answer11;
    }
    public void verifyAnswer11(){
        Assert.assertTrue(getAnswer11().isDisplayed());
    }


    public WebElement getQ12() {
        return q12;
    }
    public void verifyQues12(){
        Assert.assertTrue(getQ12().isDisplayed());
    }
    public WebElement getAnswer12() {
        return answer12;
    }
    public void verifyAnswer12(){
        Assert.assertTrue(getAnswer12().isDisplayed());
    }


    public WebElement getQ13() {
        return q13;
    }
    public void verifyQuest13(){
        Assert.assertTrue(getQ13().isDisplayed());
    }
    public WebElement getAnswer13() {
        return answer13;
    }
    public void verifyAnswer13(){
        Assert.assertTrue(getAnswer13().isDisplayed());
    }


    public WebElement getQ14() {
        return q14;
    }
    public void verifyquest14(){
        Assert.assertTrue(getQ14().isDisplayed());
    }
    public WebElement getAnswer14() {
        return answer14;
    }
    public void verifyAnswer14(){
        Assert.assertTrue(getAnswer14().isDisplayed());
    }


    public WebElement getQ15() {
        return q15;
    }
    public void verifyQues15(){
        Assert.assertTrue(getQ15().isDisplayed());
    }
    public WebElement getAnswer15() {
        return answer15;
    }
    public void verifyAnswer15(){
        Assert.assertTrue(getAnswer15().isDisplayed());
    }


    public WebElement getQ16() {
        return q16;
    }
    public void verifyQues16(){
        Assert.assertTrue(getQ16().isDisplayed());
    }
    public WebElement getAnswer16() {
        return answer16;
    }
    public void verifyAnswer16(){
        Assert.assertTrue(getAnswer16().isDisplayed());
    }


    public WebElement getQ17() {
        return q17;
    }
    public void verifyQues17(){
        Assert.assertTrue(getQ17().isDisplayed());
    }
    public WebElement getAnswer17() {
        return answer17;
    }
    public void verifyAnswer17(){
        Assert.assertTrue(getAnswer17().isDisplayed());
    }


    public void listOfFaqs() throws InterruptedException {
        scrollToElement(getSolveyourdoubts());
        waitForVisibility(By.xpath("//h2[text()='Have A Question? Solve your Doubts']"));
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        for (int i = 0; i < getFaqList().size(); i++) {
            WebElement item = getFaqList().get(i);
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", item);
            WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(item));
            Thread.sleep(1000);
            String txt = item.getText();
            System.out.println(txt);
            clickUsingJavaScript(item);
            Assert.assertTrue(getFaqList().get(i).isDisplayed());
        }
    }
}
