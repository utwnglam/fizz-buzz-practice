package tdd.fizzbuzz;

public class FizzBuzz {
  public String countOff(int count_off_order) {
    if (count_off_order % 3 == 0) {
      return "Fizz";
    } else if (count_off_order % 5 == 0) {
      return "Buzz";
    } else return Integer.toString(count_off_order);
  }
}
