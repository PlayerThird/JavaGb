import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


//В калькулятор добавьте возможность отменить последнюю операцию.
public class Hm4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> history = new ArrayDeque<>();


        while (true) {
            if (history.isEmpty()) {
                System.out.println("Введите уравнение типа a + b через пробелы");
                String equation = sc.nextLine();
                String[] uravn = equation.split(" ");
                String znak = uravn[1];
                String forCheck = uravn[0];
                if (!CheckOnCommand(forCheck)) {
                    System.out.println("И зачем? Теперь запускай заново");
                    break;
                }
                if (CheckOnCommand(znak)) {
                    System.out.println("Вот куда еще дальше? Там ничего нет");
                    break;
                }
                int firstNum = Integer.parseInt(uravn[0]);
                int secondNum = Integer.parseInt(uravn[2]);
                Wariable(znak, firstNum, secondNum, history);
            } else {
                System.out.println("Допишите уравнение дальше(так же через пробел)");
                System.out.println("Или же last - удалить последний ответ");
                System.out.print(history.getLast() + " ");
                String equation = sc.nextLine();
                String[] uravn = equation.split(" ");
                System.out.println(uravn.length);
                String forCheck = uravn[0];
                if (uravn.length == 1) {
                    System.out.println("Введёна не цифра или я что-то не понимаю");
                    int firstNum = 0;
                    int secondNum = 0;
                    Wariable(forCheck, firstNum, secondNum, history);
                } else {
                    System.out.println("Введёна не цифра?");
                    int firstNum = history.getLast();
                    String znak = uravn[0];
                    int secondNum = Integer.parseInt(uravn[1]);
                    Wariable(znak, firstNum, secondNum, history);
                }
            }
        }
    }

    private static void Wariable(String znak, int firstNum, int secondNum, Deque<Integer> history) {
        int result = 0;
        switch (znak) {
            case "+" -> {
                result = firstNum + secondNum;
                history.addLast(result);
            }
            case "-" -> {
                result = firstNum - secondNum;
                history.addLast(result);
            }
            case "*" -> {
                result = firstNum * secondNum;
                history.addLast(result);
            }
            case "/" -> {
                result = firstNum / secondNum;
                history.addLast(result);
            }
            case "last" -> history.removeLast();
            default -> System.out.println("Что-то пошло не так");
        }
    }


    private static boolean CheckOnCommand(String znak) {
        boolean hasDigits = false;
        for (int i = 0; i < znak.length() && !hasDigits; i++) {
            System.out.println(znak.charAt(i));
            if (Character.isDigit(znak.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
}
