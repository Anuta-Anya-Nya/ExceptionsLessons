package HomeWork3;

import java.util.Scanner;

public class UserInterface {
    String wordForExit = "exit";

    public String getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Введите данные человека для записи в формате: Фамилия Имя Отчество датаРождения номерТелефона пол или exit для выхода");
        String userInput = sc.nextLine();
        return userInput;
    }

    public void messageCheck() {
        System.out.println("Введены неверные данные");
    }

    public void errorCode(int errorCode) {
        if (errorCode == 1) {
            System.out.println("Введено меньше данных, чем необходимо");
        } else {
            System.out.println("Введено больше данных, чем необходимо");
        }
    }

    public void messageExData() {
        System.out.println("Неверный формат даты");
    }

    public void messageExMon() {
        System.out.println("Неверное значение месяца");
    }

    public void messageExY() {
        System.out.println("Неверное значение года");
    }

    public void messageExit() {
        System.out.println("Выход");
    }

    public String getWordForExit() {
        return wordForExit;
    }
    public void messageSuccess() {
        System.out.println("Информация успешно записана в файл");
    }
    public void messageFail() {
        System.out.println("Информация не записана в файл, введенный пользователь уже существует");
    }

}
