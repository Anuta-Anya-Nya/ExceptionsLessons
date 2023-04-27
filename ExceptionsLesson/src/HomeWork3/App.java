package HomeWork3;

public class App {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        ChekingUserInput chekingInput = new ChekingUserInput();
        DataBase dataBase = new DataBase();
        String userInput = userInterface.getInfo();
        while (!userInput.equals(userInterface.wordForExit)) {
            if (chekingInput.checkInput(userInput)) {
                PersonCard personCard = new PersonCard(userInput);
                if (dataBase.save(personCard)) {
                    Writer writer = new Writer(".txt");
                    writer.write(personCard);
                    userInterface.messageSuccess();
                } else {
                    userInterface.messageFail();
                }
            }
            userInput = userInterface.getInfo();
        }
        userInterface.messageExit();
    }
}