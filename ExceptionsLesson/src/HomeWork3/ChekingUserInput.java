package HomeWork3;

import java.time.Year;

public class ChekingUserInput {
    UserInterface userInterface = new UserInterface();

    public boolean checkInput(String string) {
        String[] array = string.split(" ");
        boolean flag = true;
        if (checkLengthInput(array)) {
            String[] titleFields = PersonCard.getFieldsPerson();
            for (int index = 0; index < titleFields.length; index++) {
                
                if (titleFields[index].equals("birthdayDate"))
                    try {
                        flag = checkData(array[index]);
                    } catch (DataFormatException e) {
                        System.out.println(e.getMessage());
                        return false;
                    }
                if (titleFields[index].equals("gender"))
                    try {
                        checkGender(array[index]);
                    } catch (GenderException e) {
                        System.out.println(e.getMessage());
                        return false;
                    }
                if (titleFields[index].equals("telNumber"))
                    try {
                        checkTelephone(array[index]);
                    } catch (TelFormatException e) {
                        System.out.println(e.getMessage());
                        return false;
                    }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    private boolean checkLengthInput(String[] array) {
        if (array.length != PersonCard.getFieldsPerson().length) {
            int errorCode;
            if (array.length < PersonCard.getFieldsPerson().length) {
                errorCode = 1;
            } else {
                errorCode = 2;
            }
            userInterface.errorCode(errorCode);
            return false;
        }
        return true;
    }

    private boolean checkData(String birthdayDate) throws DataFormatException {
        String[] array = birthdayDate.split(":");
        if (array.length != 3) {
            System.out.println("Неверный формат даты");
            return false;
        }
        try {
            int day = Integer.parseInt(array[0]);
            int month = Integer.parseInt(array[1]);
            int year = Integer.parseInt(array[2]);
            if (day < 1 || day > 32) {
                userInterface.messageExData();
                return false;
            }
            if (month < 1 || month > 13) {
                userInterface.messageExMon();
                return false;
            }
            if (year < 1900 || year > Year.now().getValue()) {
                userInterface.messageExY();
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            throw new DataFormatException();
        }
    }

    private boolean checkGender(String gender) throws GenderException {
        if (gender.equals("f") || gender.equals("m")) {
            return true;
        } else {
            throw new GenderException();
        }

    }

    private boolean checkTelephone(String telNumber) throws TelFormatException {
        try {
            int telNumb = Integer.parseInt(telNumber);
        } catch (NumberFormatException e) {
            throw new TelFormatException();
        }
        return true;
    }

}
