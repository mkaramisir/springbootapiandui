package com.udemy.learning.Springbootlearning.config.Page.google;

import com.udemy.learning.Springbootlearning.config.Page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SearchResult extends Base {

    @FindBy(css="div.rc")
    private List<WebElement> results;




    @Override
    public boolean isAt() {
        return this.wait.until((d)->!this.results.isEmpty());
    }
}
