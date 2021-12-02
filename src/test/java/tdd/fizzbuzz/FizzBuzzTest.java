package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
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
  public void should_count_off_number_multiple_of_7_return_Buzz() {
    int count_off_order = 14;

    FizzBuzz fizzBuzzGame = new FizzBuzz();
    String countOffString = fizzBuzzGame.countOff(count_off_order);
    assertThat(countOffString).isEqualTo("Whizz");
  }
}
