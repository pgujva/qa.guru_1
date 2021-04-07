package docs;

import org.junit.jupiter.api.*;

public class Junit5Examples {

  @BeforeAll
  static void setUp() {
    System.out.println("setup here");
  }

  @BeforeEach
  void each() {
    System.out.println("    BeforeEach here");
  }

  @AfterEach
  void after() {
    System.out.println("    AfterEach here");
  }

  @Test

  void someTest() {
    System.out.println("        someTest here");
  }

  @Test
  void anotherTest() {
    System.out.println("        another here");
  }
}
