package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class headerBar
{
    @FindBy(how = How.ID, using = "menu-item-13202")
    public WebElement btn_about;
}
