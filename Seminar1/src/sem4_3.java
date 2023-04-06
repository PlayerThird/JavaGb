import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        asd
//        zxc
//        qwe
//        print
//        qwe
//        zxc
//        asd
//        []
public class sem4_3 {
    public static void main(String[] args) {
        ArrayDeque<String> myList = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true){
            input=sc.next();
            if (input.equals("print")) {
                Integer size = myList.size();
                for (int i = 0; i < size; i++) {
                    System.out.println(myList.getLast());
                    myList.removeLast();
                }
                break;
            }
            else {
                myList.add(input);
            }
            for (String string : myList) {
                System.out.println(string+ " ");
            }
            System.out.println("\n");
        }
        if(myList.isEmpty()){
            System.out.println("Список пустой!");
        }
        sc.close();
    }
}
