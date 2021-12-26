package Task1.TestCase;
import Task1.Transaction.UITransaction;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static com.codeborne.selenide.Selenide.*;

public class Task1TestCase{
//    private CROPage page ;
    @BeforeMethod
    public void beforeMethod( Method method) {
//        page = new UITransaction().getCROPage();
    }

    @AfterMethod
    public void afterMethod(Method method, ITestContext iTestContext) {
    }

    @BeforeClass
    public void beforeClass() {

    }

    @AfterClass
    public void afterClass() {

    }

    @Test
    public void testTask1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D://adatesttools//myTestSourceCode//testSourceCode//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        open("https://crypto.com/exchange/markets");
        sleep(3000);
        new UITransaction().getCROPage().switchToCROTab();
        new UITransaction().getCROPage().goToTradePage("XTZ");
        sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://crypto.com/exchange/trade/spot/XTZ_CRO","");
        driver.close();
    }
}
