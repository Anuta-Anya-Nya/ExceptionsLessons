public class MyArrayDataException extends NumberFormatException{
    private int index;
    private int index2;
    public MyArrayDataException(int index, int index2) {       
        super("Некорректный формат числа на позиции: "+index+"x"+index2);
        this.index = index;
        this.index2 = index2;

    }
    
}
