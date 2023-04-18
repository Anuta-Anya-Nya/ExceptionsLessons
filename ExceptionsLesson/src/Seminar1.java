import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seminar1 {
    

    // 1. реализовать метод, принимающий целочисленный массив, если его длина меньще
    // заданного числа, возвращается код -1, в противоположном случае возвращается
    // длина массива
    public static int minLenght(int[] array, int min) {
        if (array.length < min) {
            return -1;
        } else {
            return array.length;
        }
    }

    // 2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив и
    // некоторое значение.
    // Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
    // например:
    // если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    // в качестве кода ошибки.
    // если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    // если вместо массива пришел null, метод вернет -3
    // придумайте свои варианты исключительных ситуаций и верните соответствующие
    // коды ошибок.
    // Напишите метод, в котором реализуйте взаимодействие с пользователем.
    // То есть, этот метод запросит искомое число у пользователя, вызовет первый,
    // обработает возвращенное значение и покажет
    // читаемый результат пользователю. Например, если вернулся -2, пользователю
    // выведется сообщение: “Искомый элемент не найден”.
    public static int findElement(int[] array, int value) {
        int minLenght = 3;
        if (array == null) {
            return -3;
        } else if (array.length < minLenght) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -2;
        }
    }

    public static void askUser() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Scanner in = new Scanner(System.in);
        System.out.print("Введите искомое число: ");
        int userValue = in.nextInt();
        int result = findElement(array, userValue);
        if (result == -1) {
            System.out.println("длина массива меньше заданного минимума");
        } else if (result == -2) {
            System.out.println("искомый элемент не найден");
        } else if (result == -3) {
            System.out.println("массив пустой");
        } else {
            System.out.println("Элемент " + userValue + " найден с индексом " + result);
        }
        in.close();
    }

    // 3. Реализовать метод, принимающий в качестве аргумента целочисленный
    // двумерный массивю
    // Необходимо посчитать и вернуть сумму элементов этого массиваю
    // При этом накладываются 2 ограниченияЖ
    // метод может работать только с квадратными массивами,
    // в каждой ячейке может быть только значение 0 или 1.
    // если нарушается одно из условий, метод должен бросить RuntimeException с
    // сообщением об ошибке
    public static int sumArray(int[][] array) throws RuntimeException, NullPointerException {
        if (array == null) {
            throw new NullPointerException("matrix was null");
        }
        if (array.length == 0) {
            throw new RuntimeException("MAtrix was empty");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                throw new RuntimeException("MAtrix must be square");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Element was not correct");// если не пробрасывать ошибку, а выводить
                                                                          // текст об ошибке - нарушается принцип солид
                                                                          // - единой ответсвенности. нельзя в бизнес
                                                                          // логику помещать ещеи графический интерфейс
                }
                sum += array[i][j];
            }
        }
        return sum;
    }

    // 4. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве
    // аргумента целочисленный одномерный массив.
    // Метод должен пройтись по каждому элементу и проверить что он не равен null.
    // А теперь реализуйте следующую логику:
    // Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
    // пользователя
    // Если null’ы встретились в нескольких ячейках, то идеально было бы все их
    // “подсветить”
    public static boolean checkArray(Integer[] arr) {
        boolean check = true;
        if (arr == null) {
            check = false;
            throw new NullPointerException("arr was null");
        }
        List<Integer> nullList = showInd(arr);
        if (nullList != null) {
            System.out.print("Пустые значения с индексами: ");
            for (Integer value : nullList) {
                System.out.print(value + " ");
            }
            check = false;
        } else {
            System.out.println("Пустых значений нет");
        }
        return check;

    }

    public static List<Integer> showInd(Integer[] arr) {
        List<Integer> nullInd = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == null) {
                nullInd.add(index);
            }
        }
        return nullInd;
    }
    public static void main(String[] args) {
        // задача 3
        // int[][] matrix = {{1,0,1}, {0,2,1}, {1,1,1}};
        // try{
        // System.out.println(String.format("Sum of matrix: %d", sumArray(matrix)));
        // } catch(Exception e){
        // System.err.println(String.format("error was occured. %s", e.getMessage()));
        // //system.err - вывод ошибок
        // }

        // задача 4
        Integer[] array = { 7, 1, 9, 4 };
        try {
            System.out.println(checkArray(array));
        } catch (Exception e) {
            System.err.println(String.format("error was occured. %s", e.getMessage()));
        }

    }

}
