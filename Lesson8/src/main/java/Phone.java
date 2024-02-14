import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phone {
    private final Map<String, String> phone = new HashMap<>();
    public void add(String number, String surname) {
        phone.put(number, surname);
    }
    public ArrayList<String> get(String surname) {
        ArrayList<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> o : phone.entrySet()) {
            if (o.getValue().equals(surname)) {
                phones.add(o.getKey());
            }
        }
        return phones;
    }
}
