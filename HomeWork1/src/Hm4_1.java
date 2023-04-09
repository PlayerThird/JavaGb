import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.
public class Hm4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер рандомного списка: ");
        int size = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Random el = new Random();
            list.add(el.nextInt(100));
        }
        System.out.println("Старый список = ");
        for (int c :
                list) {
            System.out.printf(c+" ");
        }
        System.out.println();
        list = NewList(list);
        System.out.println("Новый список(с щипоткой магии(*)) = ");
        System.out.printf("*");
        for (int c :
                list) {
            System.out.printf(c+"*");
        }
        sc.close();
    }

    private static LinkedList<Integer> NewList(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int c :
                list) {
            newList.addFirst(c);
        }
        return newList;
    }
}
