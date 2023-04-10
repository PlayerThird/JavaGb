import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

//Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности Имени.
public class Hm5_2 {
    public static void main(String[] args) throws IOException {
        String path = "Hm5_2.txt";
        File file = new File(path);
        BufferedReader bufReader = new BufferedReader(new FileReader(path));
        FileReader readFile = new FileReader(path);
        char[] a = new char[(int) file.length()];
        readFile.read(a);

        String line = "";

        PriorityQueue<String> pq = new PriorityQueue<>();
        Map<String,Integer> cicleNames = new HashMap<>(10);

        int count = 0;
        char znak = '\n';
        for (char c : a) {
            if (c == znak) {
                count++;
            }
        }
        //дробим строку файла в нормальную строку, которую дробим на имя, которое заносим в список
        for (int i = 0; i < count + 1; i++) {
            line = bufReader.readLine();
            String[] names = line.split(" ");
            if (!cicleNames.containsKey(names[0])){
                cicleNames.put(names[0],1);
            }else {
                cicleNames.put(names[0],cicleNames.get(names[0]) + 1);
            }
        }
        int max = 0;//проверяем сколько макс повторений
        for (int i = 0; i < 10; i++) {
            if(cicleNames.containsValue(i)) max = i;
        }



        for (int j = max; 0<j; j--) {
            for (var item: cicleNames.entrySet()) {
                if(item.getValue() == j) {
                    System.out.println(item.getKey() + " "+item.getValue());
                }
            }
        }
    }
}
