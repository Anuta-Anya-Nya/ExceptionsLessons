import java.io.IOError;
import java.io.IOException;

public class Seminar3_2 {
//     Создайте класс исключения, который будет выбрасываться при делении на 0. 
//     Исключение должно отображать понятное для пользователя сообщение об ошибке.

// Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа. 
// Исключение должно отображать понятное для пользователя сообщение об ошибке

// Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. 
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

public static class DevNUll extends ArithmeticException{
    public DevNUll(){
        super("Деление на ноль невозможно");
    }
}

public static class EmptyElement extends NullPointerException{
    public EmptyElement(){
        super("Элемент массива пустой");
    }
}
public static class NoFile extends IOException{
    public NoFile(){
        super("Файл отсутствует");
    }
}
public static void main(String[] args) {
    // Integer [] array={1,2,3,null};
    // for (int index = 0; index < array.length; index++) {
    //     if(array[index]==null){
    //         throw new EmptyElement();
    //     }
    // }
    int a = 3;
    int b = 0;
    try{
        int c = a / b;
    }catch (ArithmeticException e ){
        throw new DevNUll();
    }


}


}
