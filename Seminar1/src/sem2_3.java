import java.util.Scanner;

//Напишите метод, который принимает на вход строку (String) и
//        определяет является ли строка палиндромом (возвращает boolean значение).
public class sem2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String stroka = sc.next();
        System.out.println(isPalindrom(stroka) ? "Это палиндром" : "Это НЕ палиндром");
        sc.close();
    }
    static boolean isPalindrom(String str){
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length/2; i++) {
            if (charArr[i] != charArr[charArr.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
