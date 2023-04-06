import java.util.Scanner;

//Напишите метод, который сжимает строку.
//
//
//        Пример: вход aaaabbbcddaaa.
//        a4b3cd2a3
public class sem2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stroka = sc.next();
        System.out.println(izmena(stroka));
        sc.close();
    }

    static String izmena(String stroka) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char[] arrStrok = stroka.toCharArray();
        for (int i = 1; i < arrStrok.length; i++) {
            if (arrStrok[i] == arrStrok[i - 1]) {
                count++;
            } else {
                result.append(arrStrok[i - 1]);
                if (count != 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        result.append(arrStrok[arrStrok.length - 1]);
        if (count != 1) {
            result.append(count);
        }
        return result.toString();
    }

}
