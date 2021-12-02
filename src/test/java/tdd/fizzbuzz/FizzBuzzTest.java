package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
  @Test
  public void should_count_off_number_normal_case_return_number() {
    int count_off_order = 2;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("2");
  }

  @Test
  public void should_count_off_number_multiple_of_3_return_Fizz() {
    int count_off_order = 6;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("Fizz");
  }

  @Test
  public void should_count_off_number_multiple_of_5_return_Buzz() {
    int count_off_order = 10;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("Buzz");
  }

  @Test
  public void should_count_off_number_multiple_of_7_return_Whizz() {
    int count_off_order = 14;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("Whizz");
  }

  @Test
  public void should_count_off_number_multiple_of_3_and_5_return_FizzBuzz() {
    int count_off_order = 15;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("FizzBuzz");
  }

  @Test
  public void should_count_off_number_multiple_of_3_and_7_return_FizzWhizz() {
    int count_off_order = 21;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("FizzWhizz");
  }

  @Test
  public void should_count_off_number_multiple_of_5_and_7_return_BuzzWhizz() {
    int count_off_order = 35;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("BuzzWhizz");
  }

  @Test
  public void should_count_off_number_multiple_of_3_and_5_and_7_return_FizzBuzzWhizz() {
    int count_off_order = 105;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("FizzBuzzWhizz");
  }
}
