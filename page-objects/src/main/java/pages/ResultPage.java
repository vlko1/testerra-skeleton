package pages;

import components.ResultItem;
import eu.tsystems.mms.tic.testframework.pageobjects.Page;
import eu.tsystems.mms.tic.testframework.pageobjects.XPath;
import org.openqa.selenium.WebDriver;

public class ResultPage extends Page {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public ResultItem result() {
        return createComponent(ResultItem.class, findByXPath(XPath.from("div").classNames("rc")));
    }
}
