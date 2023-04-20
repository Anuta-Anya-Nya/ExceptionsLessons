import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Seminar2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        try{
            for(int i=0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
                }
            }
        } catch(NullPointerException ex){
            System.out.println("Массив пустой");
        } catch(NumberFormatException ex){
            System.out.println("Невозможно преобразовать строку в число");
        }
        return sum;
    }    
    // Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты с ним 
    // знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?, заменить его 
    // на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?, 
    // бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
    public static HashMap<String, String> readFile(String nameFile) {
        HashMap<String, String> result = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nameFile)))
        {
            //чтение построчно
            String str;
            while((str=br.readLine())!=null){
                String[] arrStr = new String[2];
                arrStr = str.split("=");        
                for (int index = 0; index < arrStr.length-1; index++) {
                    result.put(arrStr[index], arrStr[index+1]);
                }
            }
        }
        catch(IOException | NullPointerException ex){                    
            System.out.println(ex.getMessage());
        } 

        return result;
    }
    public static void editData(Map<String, String> text) {
        String sign = "?";
        for(Map.Entry<String, String> item: text.entrySet()){
            if(item.getValue().equals(sign)){
                String newValue = Integer.toString(item.getKey().length());
                text.replace(item.getKey(), newValue);
            }
            try{
              int value= Integer.parseInt(item.getValue());  
            } catch(NumberFormatException ex){
                System.out.println(ex.getMessage());
            }
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
        }
    }
    public static boolean writeFile(Map<String, String> text, String nameFile) {
        try(FileWriter writer = new FileWriter(nameFile, false))
        {
           // запись всей строки
           for(Map.Entry<String, String> item: text.entrySet()){
            String string = item.getKey() + "=" + item.getValue();
            writer.write(string);
            // запись по символам
            writer.append('\n');
           }    
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
        return true;
    }
    public static void main(String[] args) {
        Map<String, String> text = readFile("text.txt");
        editData(text);
        writeFile(text, "text.txt");
    }
}
