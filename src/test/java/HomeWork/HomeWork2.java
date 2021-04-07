package HomeWork;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork2 {
  @BeforeAll
  static void setup() {
    Configuration.startMaximized = true;
  }

  @Test
  void successfulFillTest() {
    open("https://demoqa.com/automation-practice-form");
    $(byId("firstName")).setValue("pasha");
    $(byId("lastName")).setValue("gujva");
    $(byId("userEmail")).setValue("test@mail.ru");
    $(byText("Male")).click();
    $(byId("userNumber")).setValue("123");
    $(byId("dateOfBirthInput")).click();
    $(".react-datepicker__month-select").click();
    $(".react-datepicker__month-select option:first-child").click();
    $(".react-datepicker__year-select").click();
    $(".react-datepicker__year-select option:nth-child(3)").click();
    $(".react-datepicker__week div:nth-child(3)").click();
    $("#subjectsContainer input").val("te").pressEnter();
    $(byText("Reading")).click();
    $(byId("uploadPicture")).uploadFile(new File("resources/_GihpfJgTSU.jpeg"));
    $(byId("currentAddress")).setValue("5555");
    $(byId("state")).click();
    $("#submit").click();
    System.out.println("debug");
  }

}
