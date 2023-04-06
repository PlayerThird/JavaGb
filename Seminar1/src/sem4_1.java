import java.util.ArrayList;
import java.util.LinkedList;

//1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

public class sem4_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();//старт таймера
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(i);
        }
        long stopA = System.currentTimeMillis();
        System.out.println(stopA - start);

        LinkedList<Integer> linkedList = new LinkedList<>();
        long startB = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(i);
        }
        long stopB = System.currentTimeMillis();
        System.out.println(stopB - startB);
    }
}
