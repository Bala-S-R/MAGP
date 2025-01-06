package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestFaq extends BaseTest {
    @Test (priority = 0)
    public void globalSearchFAQ(){
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickfaqtab();
        pm.faqPage().globalSearchFAQ();
    }

    @Test (priority = 1)
    public void searchFaq(){
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickfaqtab();
        pm.faqPage().searchFAQ();
    }
    @Test (priority = 2)
    public void clicktext() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickfaqtab();
        pm.faqPage().searchFAQ();
        pm.faqPage().clicktext();
        pm.faqPage().closetextbox();
        pm.faqPage().crossbtn();
        pm.faqPage().profile();
    }

    @Test
    public void verifyUI() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickfaqtab();
        pm.faqPage().listOfFaqs();


    }
}
