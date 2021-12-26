package Task1.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;


import java.lang.reflect.Method;

public class BaseTestCase {
    @BeforeMethod
    public void baseBeforeMethods( Method method) {
        System.out.println("开始执行方法：" + method.getName());
    }

    @AfterMethod
    public void baseAfterMethods(Method method, ITestContext iTestContext) {
        System.out.println("结束执行方法：" + method.getName());
    }

    @BeforeClass
    public void baseBeforeClass() {
        System.out.println("开始执行class");

    }

    @AfterClass
    public void baseAfterClass() {
        System.out.println("结束执行class");

    }

}
