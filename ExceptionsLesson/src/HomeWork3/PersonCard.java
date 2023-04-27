package HomeWork3;

import java.util.HashMap;

public class PersonCard {

    private static String[] fieldsPerson = { "surname", "name", "middleName", "birthdayDate", "telNumber", "gender" };
    private HashMap<String, String> PersonInfo = new HashMap<>();

    public PersonCard() {
    }

    public PersonCard(String string) {
        String[] array = string.split(" ");
        for (int index = 0; index < array.length; index++) {
            this.getPersonInfo().put(PersonCard.getFieldsPerson()[index], array[index]);
        }
    }

    public String getTextForWrite() {
        StringBuilder stringForWrite = new StringBuilder();
        for (int i = 0; i < fieldsPerson.length; i++) {
            stringForWrite.append("<" + PersonInfo.get(fieldsPerson[i]) + ">");
        }
        return stringForWrite.toString();
    }

    public static String[] getFieldsPerson() {
        return fieldsPerson;
    }

    public HashMap<String, String> getPersonInfo() {
        return PersonInfo;
    }
}
