import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    private final Map<String, List<String>> phone = new HashMap<>();

    public void add(String surname, String number) {
        List<String> number_list;
        if (phone.containsKey(surname)) {
            number_list = phone.get(surname);
        } else {
            number_list = new ArrayList<>();
        }
        number_list.add(number);
        phone.put(surname, number_list);
    }

    public List<String> get(String surname) {
        return phone.get(surname);
    }
}
