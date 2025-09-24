import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

        final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String LOWER = "abcdefghijklmnopqrstuvwxyz";
        final String DIGITS = "0123456789";
        final String SPECIAL = "!@#$%^&*()-_=+<>?";
        final String ALL = UPPER + LOWER + DIGITS + SPECIAL;

        private int length;

        SecureRandom random = new SecureRandom();

        public PasswordGenerator(int length){
        if (length < 8 ) {
            System.out.println("Неверная длина, установлено 8.");
            this.length = 8;
        }
        else if(length > 12){
            System.out.println("Неверная длина, установлено 12.");
            this.length = 12;
        }
        else{
            this.length = length;
        }
    }
    public String generatePassword(){
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(ALL.charAt(random.nextInt(ALL.length())));
        }

        return password.toString();
    }
    }