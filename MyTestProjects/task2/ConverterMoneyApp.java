import java.util.Scanner;

public class ConverterMoneyApp {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите сумму в рублях: ");

      double rubles = scanner.nextDouble();

      ConverterMoney converter = new ConverterMoney(rubles);
      
      converter.printConvert();
    }
}
