package Task1.Page;

import Task1.By.CROBy;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class CROPage implements CROBy {
    private static final int NUM = 3;
    public void switchToCROTab() throws InterruptedException {
        System.out.println("swithToCROTab begins");
        $(CROTab).waitUntil(Condition.appear,3000).scrollTo();
        System.out.println("CROtab displays");
        System.out.println($(CROTab));
        Selenide.executeJavaScript("arguments[0].click();", $(CROTab));
    }

    public void goToTradePage(String tradeName){

        By CROItem = this.getCROItem(tradeName);
        System.out.println("goToTradePage begins");
        $(CROItem).waitUntil(Condition.appear,3000).scrollTo();
        System.out.println("CROItem displays");

        Selenide.executeJavaScript("arguments[0].click();", $(CROItem));
    }

    public By getCROItem(String itemText) {
        String xpathStr = "//div[@class='trade-list']//div[contains(string(),'"+ itemText +"')]//parent::td//following-sibling::td[6]//button";
        By CROItem = By.xpath(xpathStr);
        System.out.println(CROItem);
        System.out.println($(By.xpath("//div[@class='trade-list']//div[contains(string(),'"+ itemText +"')]")));
        System.out.println($(By.xpath("//div[@class='trade-list']//div[contains(string(),'"+ itemText +"')]//parent::td")));
        System.out.println($(By.xpath("//div[@class='trade-list']//div[contains(string(),'"+ itemText +"')]//parent::td//following-sibling::td[6]")));
        return CROItem;
    }
}
