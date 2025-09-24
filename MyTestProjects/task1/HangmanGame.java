import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class HangmanGame{
    //Класс для игровой логики

    private final String[] words = {"джава", "программирование", "виселица", "разработчик", "сенла","киберпанк"};//массив возможных слов
        
    private String word = words[new Random().nextInt(words.length)];//массив рандомного неизвестного слова
        
    private char[] unknown_word = new char[word.length()];//создание массива в длину неизвестного слова
        
    private int lives;//жизни
        
    private final Scanner scanner;//для объекта scanner
        
    private final HangmanDraw draw;//для объекта класса для рисования

    public HangmanGame(){
        //конструктор класса
        this.word = words[new Random().nextInt(words.length)];

        this.unknown_word = new char[word.length()];

        Arrays.fill(unknown_word, '_');

        this.lives = 6;

        this.draw = new HangmanDraw();

        this.scanner = new Scanner(System.in);

    }

    public void start(){
        //Метод начала игры
        System.out.println("Добро пожаловать в игру Виселица!");

            while (lives > 0 && new String(unknown_word).contains("_")) {

            printGameState();

            char letter = askForLetter();

            foundingLetter(letter);
        }

        endGame();
    }


    private void printGameState(){
        //Метод состояния игры

        System.out.println("\nСлово: " + String.valueOf(unknown_word));

        System.out.println("Осталось жизней: " + lives);

        draw.drawHangman(lives);
    }
    private char askForLetter(){
        //Метод запроса буквы
        while(true){

            System.out.print("Введите букву: ");

            String input = scanner.nextLine().toLowerCase();
                
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {

                return input.charAt(0);
            }
            System.out.println("Введите только одну букву!");
        }
    }

    private void foundingLetter(char letter){
        //Поиск введенной буквы в неизвестном слове
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                unknown_word[i] = letter;
                found = true;
            }
        }

        if (!found) {
            lives--;
            System.out.println("Нет такой буквы!");
        }
    }
    private void endGame(){
        //Метод для конца игры
        if (lives > 0) {
            System.out.println("\nПоздравляем! Вы угадали слово: " + word);
        } else {
             draw.drawHangman(0);
            System.out.println("\nВы проиграли! Было загадано слово: " + word);
        }
    }

}
