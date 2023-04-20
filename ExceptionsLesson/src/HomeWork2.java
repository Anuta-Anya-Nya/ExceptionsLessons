import java.util.Scanner;

public class HomeWork2 {
    // task1
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // (типа float), и возвращает введенное значение.
    // Ввод текста вместо числа не должно приводить к падению приложения, вместо
    // этого, необходимо повторно запросить у пользователя ввод данных.
    public static float getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        while (!sc.hasNextFloat()) {
            System.out.print("Введенные данные не дробное число! Повторите ввод: ");
            sc.next();

        }
        float userNumber = sc.nextFloat();
        sc.close();
        System.out.print("Введенно дробное число: " + userNumber);
        return userNumber;
    }

    // task2 исправить если нужно
    // try {
    // int d = 0;
    // double catchedRes1 = intArray[8] / d;
    // System.out.println("catchedRes1 = " + catchedRes1);
    // } catch (ArithmeticException e) {
    // System.out.println("Catching exception: " + e);
    // }
    public static void task2() {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    // task3
    // public static void main(String[] args) throws Exception {
    // try {
    // int a = 90;
    // int b = 3;
    // System.out.println(a / b);
    // printSum(23, 234);
    // int[] abc = { 1, 2 };
    // abc[3] = 9;
    // } catch (Throwable ex) {
    // System.out.println("Что-то пошло не так...");
    // } catch (NullPointerException ex) {
    // System.out.println("Указатель не может указывать на null!");
    // } catch (IndexOutOfBoundsException ex) {
    // System.out.println("Массив выходит за пределы своего размера!");
    // }
    // }
    // public static void printSum(Integer a, Integer b) throws
    // FileNotFoundException {
    // System.out.println(a + b);
    // }
    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя");
            // } catch (NullPointerException ex) {
            // System.out.println("Указатель не может указывать на null!") лишнее
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // ljk;yj ,snm d rjywt
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { // throws FileNotFoundException лишнее
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        task4();
    }

    // task4
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит
    // пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String userMessage = sc.nextLine();
        sc.close();
        if (userMessage.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }        
    }
}
