package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataBase {
    UserInterface userInterface = new UserInterface();
    private List<PersonCard> cards;

    public DataBase() {
        this.cards = new ArrayList<>();
    }

    public boolean save(PersonCard personCard) {
        for (PersonCard card : cards) {
            if(equalMaps(card.getPersonInfo(), personCard.getPersonInfo()))
                 return false;
        }
        cards.add(personCard);
        return true;
    }

    private boolean equalMaps(Map<String, String> map1, Map<String, String> map2) {
        if (map1.size() != map2.size())
            return false;
        for (String key : map1.keySet()) {
            if (!map1.get(key).equals(map2.get(key)))
                return false;
        }
        return true;
    }

    
    public void printBd() {
        for (PersonCard card : cards) {
            System.out.println(card.getPersonInfo());  
        }
    }

    public List<PersonCard> getCards() {
        return cards;
    }

}
