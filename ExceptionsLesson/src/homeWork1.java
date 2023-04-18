public class homeWork1 {
    // task1
    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("can't divide by zero");
        } else {
            return a / b;
        }
    }

    public static int getLenght(String str) {
        if (str == null) {
            throw new NullPointerException("String is null");
        } else {
            return str.length();
        }
    }

    public static int convertInInt(String str) { // NumberFormatException
        int result = Integer.parseInt(str);
        return result;
    }
    
// task2
// NullPointerException если на входе пустой массив
// ArrayIndexOutOfBoundsException если матрица имеет меньше 5 столбцов
// NumberFormatException если в матрице есть строки, которые не конвертируются в инты


    // task3
    public static Integer[] difArr(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays length are not equal");
        }
        Integer[] result = new Integer[arr1.length];
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index] == null || arr2[index] == null) {
                throw new RuntimeException("element is null");
            }
            result[index] = arr1[index] - arr2[index];
        }
        return result;
    }

    // task4
    public static Integer[] divArr(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays length are not equal");
        }
        Integer[] result = new Integer[arr1.length];
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index] == null || arr2[index] == null) {

            }
            if (arr2[index] == 0) {
                throw new RuntimeException("can't divide by zero");
            }
            result[index] = arr1[index] / arr2[index];
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(div(2, 2));
            System.out.println(getLenght("null"));
            System.out.println(convertInInt("123"));
            Integer[] arr1 = { 1, 2, 3, 4 };
            Integer[] arr2 = { 2, 3, 8, 0 };
            // Integer[] task3 = difArr(arr1, arr2);
            Integer[] task4 = divArr(arr1, arr2);
            for (Integer value : task4) {
                System.out.print(value + " ");
            }
        } catch (ArithmeticException | NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName());
        }
    }

}
