import java.io.File;

public class Lesson1 {
    public static void main(String[] args) {
        String[][] matr = {{"1", null, "3","2", "0"}, {"2", "0", "1","2", "0"}};
       System.out.println(sum2d(matr)); 
    }


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    // public static long getFileSize(File file){
    //     if(!file.exists()){
    //         return -1;
    //     }
    //     return file.length();
    // }
    // public static int divide(int a1, int a2){
    //     if (a2 == 0){
    //         throw new RuntimeException("Divide by zero not permited");
    //     }
    //     return a1/a2;
    // }
}


// NullPointerException пустой массив
// ArrayIndexOutOfBoundsException если матрица имеет меньше 5 столбцов
// NumberFormatException если в матрице есть строки, которые не конвертируются в инты
