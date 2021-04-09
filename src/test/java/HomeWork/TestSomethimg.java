package HomeWork;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;

public class TestSomethimg {

  @Test
  public void testOne() {
    open("https://demoqa.com/automation-practice-form");
   SelenideElement a = $("div.col-12.mt-4.col-md-6");
    System.out.println(a);
    //$("#column-a").find("header").shouldHave(text("B"));
  }
}
