import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//        Добавить функции 1) Добавление номера
//        2) Вывод всего
//        Пример:
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 1242353
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я ввожу: 1
//        К: Введите фамилию
//        Я: Иванов
//        К: Введите номер
//        Я: 547568
//        К: Введите 1) Добавление номера
//        2) Вывод всего
//        Я: 2
//        Иванов: 1242353, 547568
public class Hm5_1 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1) Добавить контакт" +
                    "\n2) Вывести все номера по имени" +
                    "\n3) Выход из это БЕСКОНЕЧНОГО ЦИКЛА!");
            String menu = sc.next();

            switch (menu){
                case "1" -> AddContact(phoneBook);
                case "2" -> ShowContacts(phoneBook);
                case "3" -> {
                    return;
                }
            }
        }
    }

    private static void ShowContacts(Map<String, String> phoneBook) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя, у кого вы хотите увидеть номера");
        String name = sc.next();
        if (phoneBook.containsKey(name)){
            System.out.println(phoneBook.get(name));
        }else {
            System.out.println("Ищу-ищу, а регистр ты не учёл?");
        }
    }

    private static void AddContact(Map<String, String> phoneBook) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.next();
        System.out.println("Введите номер");
        String phone = sc.next();
        if (!phoneBook.containsKey(name)){
            phoneBook.put(name,phone+" ");
        }else {
            phoneBook.put(name, phoneBook.get(name).concat(phone+ " "));
        }

    }

}
