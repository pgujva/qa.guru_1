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

public class HomeWork3_1 {
  @BeforeAll
  static void setup() {
    Configuration.startMaximized = true;
  }

  @Test
  void successfulFillTest() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo("#column-b");
    $("#column-a").find("header").shouldHave(text("B"));
  }
}
