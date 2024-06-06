package kyu_6.basics_08_find_next_higher_number_with_same_bits_1_s.groovy;
import org.junit.jupiter.api.*
import static org.junit.jupiter.api.Assertions.assertEquals

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExampleTest {

  @Test @Order(1)
  @DisplayName("nextHigher(1) should return 2")
  void test_n_1() {
    assertEquals(2, Kata.nextHigher(1))
  }

  @Test @Order(2)
  @DisplayName("nextHigher(128) should return 256")
  void test_n_128() {
    assertEquals(256, Kata.nextHigher(128))
  }

  @Test @Order(3)
  @DisplayName("nextHigher(1022) should return 1279")
  void test_n_1022() {
    assertEquals(1279, Kata.nextHigher(1022))
  }

  @Test @Order(4)
  @DisplayName("nextHigher(127) should return 191")
  void test_n_127() {
    assertEquals(191, Kata.nextHigher(127))
  }

  @Test @Order(5)
  @DisplayName("nextHigher(1253343) should return 1253359")
  void test_n_1253343() {
    assertEquals(1253359, Kata.nextHigher(1253343))
  }
}
