import java.time.Year;
import java.util.HashMap;
import java.util.Set;

// import java.io.File;

public class Lesson1 {
    public static void main(String[] args) {
    //     String[][] matr = {{"1", null, "3","2", "0"}, {"2", "0", "1","2", "0"}};
    //    System.out.println(sum2d(matr)); 
//     HashMap<String, String> PersonInfo = new HashMap<>(){{ put("surname", null);
//                                                               put("name", null);
//                                                               put("middleName", null);
//                                                               put("birthdayDate", null);
//                                                               put("telNumber", null);
//                                                               put("gender", null);  }                                                            
// };
// Set<String> keys = PersonInfo.keySet();
// System.out.println(keys);
// System.out.println(checkData("3:12:2024"));
        HashMap<String, String> hash1 =  new HashMap<>();
        hash1.put("name", "anna");
        hash1.put("surname", "She");
        HashMap<String, String> hash2 =  new HashMap<>();
        hash2.put("name", "anna");
        hash2.put("surname", "She");
        System.out.println(hash1.equals(hash2));

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
    public static boolean checkData(String birthdayDate){
        String[] array = birthdayDate.split(":");
        if(array.length != 3){
            System.out.println("Неверное число");
            return false;
        }
        int day = Integer.parseInt(array[0]);
        int month = Integer.parseInt(array[1]);
        int year = Integer.parseInt(array[2]);
        System.out.println(String.format("%d-%d-%d", day, month,year));
        if(day<1 || day>32) return false;
        if(month<1 || month>13) return false;
        if(year<1900 || year>Year.now().getValue()) return false;
        return true;
        
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
