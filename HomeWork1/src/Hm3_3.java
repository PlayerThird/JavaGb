import java.util.ArrayList;
import java.util.Scanner;

public class Hm3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        Integer size = sc.nextInt();


        ArrayList<Integer> arrNew = new ArrayList<>();
        System.out.println("Заполните массив размером " + size);
        for (int i = 0; i < size; i++) {
            arrNew.add(sc.nextInt());
        }
        if (size == 1){ System.out.println("Сюда просто равны все цифры = "+ arrNew.get(0));
        return;}
        int max = arrNew.get(0);
        int min = arrNew.get(0);
        int midle =0;
        for (int i = 0; i < arrNew.size(); i++) {
            if(arrNew.get(i)> max) max = arrNew.get(i);
            if (arrNew.get(i) < min) min = arrNew.get(i);
            midle += arrNew.get(i);
        }
        midle = midle / size;
        boolean check = false;
        for (int i = 0; i < arrNew.size(); i++) {
            if(arrNew.get(i) == midle) check = true;
        }
        System.out.println("Минимальное = "+min);
        if (check) System.out.println("Среднее = "+ midle);
        else System.out.println("Среднего тут нет :/");
        System.out.println("Максимальное = "+max);
    }
}
