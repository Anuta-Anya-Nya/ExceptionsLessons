package HomeWork3;

public class DataFormatException extends NumberFormatException{
    public DataFormatException(){
        super("Ошибка! Введен неверный формат даты");
    }
}
