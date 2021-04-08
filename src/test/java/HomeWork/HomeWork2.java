package HomeWork;

import com.codeborne.selenide.Condition;
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
    Configuration.timeout = 2000;
    //go to page
    open("https://demoqa.com/automation-practice-form");
    $("#firstName").setValue("pasha");
    $("#lastName").setValue("gujva");
    $("#userEmail").setValue("test@mail.ru");
    $(byText("Male")).click();
    $("#userNumber").setValue("8904442222");

    //календарь
    $("#dateOfBirthInput").click();
    // выбор месяца
    $$("option").get(6).click();
    // выбор года
    $(".react-datepicker__year-select").click();
    $$(".react-datepicker__year-select option").get(6).click();
    // выбор дня
    $("[aria-label='Choose Tuesday, July 3rd, 1906']").click();

    $("#subjectsContainer input").setValue("te").pressEnter();
    $(byText("Reading")).click();
    // загрузка файла
    $("#uploadPicture").uploadFile(new File("resources/_GihpfJgTSU.jpeg"));
    $("#currentAddress").setValue("5555");
    $("#state").click();
    $(byText("Uttar Pradesh")).click();
    $("#city").click();
    $(byText("Lucknow")).click();
    $("#submit").click();
    $(".table-responsive").shouldHave((Condition.text("pasha " + "gujva")),
            Condition.text("test@mail.ru"),
            Condition.text("mail"));
  }

}
