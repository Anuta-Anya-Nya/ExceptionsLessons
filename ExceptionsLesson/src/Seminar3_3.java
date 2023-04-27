public class Seminar3_3 {
    // Напишите метод, на вход которого подаётся двумерный строковый массив размером
    // 4х4.
    // При подаче массива другого размера необходимо бросить исключение
    // MyArraySizeException.

    // Далее метод должен пройтись по всем элементам массива, преобразовать в int и
    // просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в
    // ячейке лежит символ или текст вместо числа),
    // должно быть брошено исключение MyArrayDataException с детализацией, в какой
    // именно ячейке лежат неверные данные.

    // В методе main() вызвать полученный метод, обработать возможные исключения
    // MyArraySizeException и MyArrayDataException
    // и вывести результат расчета (сумму элементов, при условии что подали на вход
    // корректный массив).

    public static int sumArray(String[][] arr, int size) throws Exception {
        if (arr.length != size) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != size){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] array = { { "1", "2", "3", "4" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3", "4" } };
        try {
            System.out.println(sumArray(array, 4));
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
