import java.io.IOException;

public class Seminar3 {
    // Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
    // внутренней int переменной на 1.
    // Сделайте так, чтобы с объектом такого типа можно было работать в блоке
    // try-with-resources.
    // Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод
    // для проверки, закрыт ли ресурс.
    // При попытке вызвать add() у закрытого ресурса, должен выброситься IOException

    public static class Counter implements AutoCloseable {
        private int count;
        private boolean close = false;

        public Counter() {
        }

        public int add() throws IOException {
            if(!this.close){
                return this.count++;
            }else{
                throw new IOException();
            }
        }
        @Override
        public void close() throws Exception {
            this.count = 0;
            this.close = true;
        }
    }
    
        public static void main(String[] args) {
            try (Counter counter = new Counter()) {
                counter.add();
            } catch (Exception e) {
                System.out.println("Message");
            }
        }
    
}
