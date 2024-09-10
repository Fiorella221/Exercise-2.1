import java.util.Scanner;

public class CelsiustoFahrenheit {
  public static void main(String[] args) {
    double celsius = 0.0;
    double fahrenheit = 0.0;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Celsius: ");
    celsius = input.nextDouble();

    //Fahrenheit = (9.0 / 5) * Celsius + 32
    fahrenheit = (9.0 / 5) * celsius + 32;
    System.out.println("Fahrenheit: " + fahrenheit);
    input.close();
  }
}