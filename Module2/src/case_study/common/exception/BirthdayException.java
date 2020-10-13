package case_study.common.exception;

public class BirthdayException extends Exception {
  public void printMessage() {
      System.err.println("Customer's age is not acceptable");
  }
}
