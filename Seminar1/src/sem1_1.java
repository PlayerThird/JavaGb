import java.util.Scanner;

public class sem1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//ввод из консоли открывает доступ для считывания с терминала
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println(age);
        System.out.println(name);
        sc.close();//закрывать сканер в конце
    }
}