package Task1.By;
import org.openqa.selenium.By;
public interface CROBy {
    By CROTab = By.xpath("//div[@class='market-title-box markets-container']//div[@class='e-tabs__nav-item'][contains(string(),'CRO')]");

    By getCROItem(String itemText);
}
