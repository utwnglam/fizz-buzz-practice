package tdd.fizzbuzz;

public class FizzBuzz {
  public String countOff(int countOffOrder) {
    String result = "";
    if (countOffOrder % 3 == 0) {
      result += "Fizz";
    }
    if (countOffOrder % 5 == 0) {
      result += "Buzz";
    }
    if (countOffOrder % 7 == 0) {
      result += "Whizz";
    }
    if (result.length() == 0) {
      result = Integer.toString(countOffOrder);
    }
    return result;
  }
}
