import java.util.Scanner;

public class PasswordGeneratorApp {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину пароля (8–12): ");

        int length = scanner.nextInt();

        PasswordGenerator generator = new PasswordGenerator(length);
        
        String password = generator.generatePassword();

        System.out.println("Сгенерированный пароль: " + password);
     }
    
}
