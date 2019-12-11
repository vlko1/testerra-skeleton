package components;

import eu.tsystems.mms.tic.testframework.pageobjects.AbstractComponent;
import eu.tsystems.mms.tic.testframework.pageobjects.UiElement;
import eu.tsystems.mms.tic.testframework.pageobjects.TestableUiElement;
import org.openqa.selenium.By;

public class ResultItem extends AbstractComponent<ResultItem> {
    public ResultItem(UiElement rootElement) {
        super(rootElement);
    }

    @Override
    protected ResultItem self() {
        return this;
    }

    public TestableUiElement headline() {
        return find(By.className("S3Uucc"));
    }
}
