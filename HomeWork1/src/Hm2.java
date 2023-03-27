//Вывести все простые числа от 1 до 1000
public class Hm2 {
    public static void main(String[] args) {
        for (int i = 0; i < 1001; i++) {
            if ((i%2 != 0) && (i%3!=0)&& (i%5!=0)&& (i%7!=0)) {
                System.out.println(i);
            }
        }
    }
}
