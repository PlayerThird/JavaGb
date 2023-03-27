import java.util.Scanner;

public class Hm4 {
    public static void main(String[] args) {
        System.out.println("Введите уровнение в виде a + b = c\n" +
                "При необходимости можно заменить цифры знаком ?");
        Scanner sc = new Scanner(System.in);
        String equation = sc.nextLine();

        System.out.println("Введённое выражение = "+ equation);

        int indexQuest = equation.indexOf("?");
        for (int i = 0; i < 10; i++) {
            if (indexQuest == -1) {
                String[] arr = equation.split(" ");
                int firstNum = Integer.parseInt(arr[0]);
                int secondNum = Integer.parseInt(arr[2]);
                int sequel = Integer.parseInt(arr[4]);
                if (firstNum + secondNum == sequel) {
                    System.out.printf("Есть такой вариант = %d + %d = %d", firstNum, secondNum, sequel);
                    break;
                }
            }
            else {
                String number = Integer.toString(i);
                String newString = equation.replace("?", number);
                String[] arr = newString.split(" ");
                int firstNum = Integer.parseInt(arr[0]);
                int secondNum = Integer.parseInt(arr[2]);
                int sequel = Integer.parseInt(arr[4]);
                if (firstNum + secondNum == sequel) {
                    System.out.printf("Есть такой вариант = %d + %d = %d", firstNum, secondNum, sequel);
                    break;
                }
            }
        }
        System.out.println("\nЛибо решения нет, либо смотри выше, ну или код написан кривыми руками");
    }
}
