public class Calculator {

  private int add(int x, int y) {
    int result = x + y;
    System.out.println(x + " + " + y + " = " + result);
    return result;
  }

  public void subtract(int x, int y) {
    int result = x - y;
    System.out.println(x + " - " + y + " = " + result);
  }

  public void multiply(int x, int y) {
    int result = x * y;
    System.out.println(x + " * " + y + " = " + result);
  }

  public void modulus(int x, int y) {
    int result = x % y;
    System.out.println("The remainder of " + x + " / " + y + " = " + result);
  }

  public void divide(int x, int y) {
    double a = (double) x;
    double b = (double) y;
    double result = a / b;
    System.out.println(x + " / " + y + " = " + result);
  }
}



Calculator calc = new Calculator;

System.out.println("Somma ");
calc.divide(20,5)