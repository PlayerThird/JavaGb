
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;



//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class Hm4_2 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> list = new LinkedList<>();

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Следующие методы:\n" +
                    "enq - помещает элемент в конец очереди,\n" +
                    "deq - возвращает первый элемент из очереди и удаляет его,\n" +
                    "fir - возвращает первый элемент из очереди, не удаляя.\n" +
                    "q - выход из прогроммы");
            if (!list.isEmpty()){
                System.out.print("В списке пока творится это -> ");
                for (String c :
                        list) {
                    System.out.printf(c + " ");
                }
            }else System.out.println("А в списке пока ничего нет");
            System.out.println("\nВведите интерисующий вас пункт: ");
            String quest = sc.next();
            switch (quest){
                case "enq" -> list = enqueue(list);
                case "deq" -> list = dequeue(list);
                case "fir" -> first(list);
                case "q" -> {return;}
                default -> System.out.println("Либо что-то не то, либо что-то не там");
            }
        }

    }

    private static void first(LinkedList<String> list) {
        System.out.println(list.getFirst());
    }

    private static LinkedList<String> dequeue(LinkedList<String> list) {
        if (list.isEmpty()) System.out.println("И смысл? Тут ничего нет");
        else System.out.println(list.pop());
        return list;
    }

    private static LinkedList<String> enqueue(LinkedList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элемент -> ");
        list.addLast(sc.nextLine());
        return list;
    }
}
