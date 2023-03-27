
import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//        Ввод:5
//        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//        n! 1 * 2 * 3 * 4 * 5 = 120
public class Hm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt();
        int trio = 0;
        int bigN = 1;
        for (int i = 0; i < num; i++) {
            trio += i+1;
            bigN *= i+1;
        }
        System.out.println("Трегольник = "+ trio + ", a вокториал = "+bigN);

    }
}