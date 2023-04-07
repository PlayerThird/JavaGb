import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Hm3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        Integer size = sc.nextInt();
        ArrayList<Integer> arrNew = new ArrayList<>();
        System.out.println("Заполните массив размером " + size);
        for (int i = 0; i < size; i++) {
            arrNew.add(sc.nextInt());
        }
        for (int i = 0; i < arrNew.size(); i++) {
            if(arrNew.get(i) %2 == 0){
                arrNew.remove(i);
            }
        }
        System.out.println("`Подчищенный` список = ");
        for (int x :
                arrNew) {
            System.out.println(x);
        }
    }
}
