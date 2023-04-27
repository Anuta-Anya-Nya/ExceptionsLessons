package HomeWork3;

public class GenderException extends NumberFormatException{
    public GenderException(){
        super("Ошибка! Введен неверный формат пола");
    }
}
