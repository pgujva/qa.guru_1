package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

  @BeforeAll
  static void setup() {
    Configuration.startMaximized = true;
  }

  @Test
  void successfulFillTest() {
    open("https://demoqa.com/text-box");
    $(byId("userName")).setValue("pasha");
    $(byId("userEmail")).setValue("test@mail.ru");
    $(byId("currentAddress")).setValue("street_1");
    $(byId("permanentAddress")).setValue("street_2");
    $(byId("submit")).click();

    System.out.println("debug");
  }

}
