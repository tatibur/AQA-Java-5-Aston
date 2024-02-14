/*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class MainPhone {
    public static void main(String[] args) {
        Phone telefon = new Phone();
        telefon.add("291111111", "Ivanov");
        telefon.add("292222222", "Petrov");
        telefon.add("293333333", "Sidorov");
        telefon.add("294444444", "Ivanov");

        System.out.println("Ivanov: " + telefon.get("Ivanov"));
        System.out.println("Petrov: " + telefon.get("Petrov"));
        System.out.println("Sidorov: " + telefon.get("Sidorov"));
    }
}
