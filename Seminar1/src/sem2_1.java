//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2, начиная с c1.
//        6
//        a b
//        ababab


import java.util.Scanner;

public class sem2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        System.out.println("Введите первый символ");
        String firstChar = sc.next();
        System.out.println("Введите второй символ");
        String secondChar = sc.next();
        System.out.println(str(number,firstChar,secondChar));
sc.close();
    }
    static String str(int number, String firstChar, String secondChar){
        StringBuilder result = new StringBuilder();
        String twoChars = firstChar + secondChar;
        for (int i = 0; i < number/2; i++) {
            result.append(twoChars);
        }

        return result.toString();
    }
}
