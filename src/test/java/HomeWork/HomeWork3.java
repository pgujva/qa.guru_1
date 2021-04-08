package HomeWork;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork3 {
  @BeforeAll
  static void setup() {
    Configuration.startMaximized = true;
  }

  @Test
  void successfulFillTest() {
    open("https://github.com/selenide/selenide");
    $("span[data-content='Wiki']").click();
    $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
    $$(".internal").findBy(text("Soft Assertions")).click();
  //  $("[href ='/selenide/selenide/wiki/SoftAssertions']").click();
    $(".markdown-body").shouldHave(text("Using JUnit5"));
  }
}