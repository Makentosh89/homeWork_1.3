import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Построить диалог с компьютером.

        // Пример:
        // Привет, как тебя зовут? – Компьютер
        // Сабина - Пользователь
        // Сабина, приятно познакомиться – Компьютер
        // В каком году ты родилась? – Компьютер
        // 1996 - Пользователь
        // Вам 24 лет* - Компьютер
        // почему «лет», а не «года», узнаем как правильно делать на следующем уроке

        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет, как тебя зовут ?");
        String name = scanner.nextLine();
        System.out.println(name + " ,приятно познакомиться !");
        System.out.println("В каком году ты родилась(ся) ?");
        int year = scanner.nextInt();
        int age = 2022 - year;
        System.out.println("Вам "+age+" лет,год,года");

    }
}
