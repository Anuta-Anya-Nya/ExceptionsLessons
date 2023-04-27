package HomeWork3;

public class TelFormatException extends NumberFormatException{
    public TelFormatException(){
        super("Ошибка! Введен неверный формат телефона");
    }
}
