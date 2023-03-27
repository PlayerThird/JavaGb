import java.util.Scanner;

//Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->
public class Hm3 {
    public static void main(String[] args) {
        System.out.println("Введите уравнение типа a + b через пробел:");
        Scanner sc = new Scanner(System.in);
        String equation = sc.nextLine();
        String[] uravn = equation.split(" ");

        int firstNum = Integer.parseInt(uravn[0]);
        int secondNum = Integer.parseInt(uravn[2]);
        int result = 0;
        String znak = uravn[1];


        switch (znak) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> result = firstNum / secondNum;
            default -> System.out.println("Что-то пошло не так");
        }
        System.out.println("Результат = " + result);
    }
}

