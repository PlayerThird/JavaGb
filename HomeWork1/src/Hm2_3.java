import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->
public class Hm2_3 {
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("Hm2_3Log.txt");
        Logger logger = Logger.getLogger(Hm2_3.class.getName());
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("Старт программы");
        System.out.println("Введите уравнение типа a + b через пробел:");
        Scanner sc = new Scanner(System.in);
        String equation = sc.nextLine();
        String[] uravn = equation.split(" ");

        int firstNum = Integer.parseInt(uravn[0]);
        int secondNum = Integer.parseInt(uravn[2]);
        int result = 0;
        String znak = uravn[1];
        logger.info("Были введены: \n " +
                "1)1 число: " + firstNum +
                "\n 2)2 число: " + secondNum +
                "\n 3)Знак : "+ znak);

        switch (znak) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> result = firstNum / secondNum;
            default -> System.out.println("Что-то пошло не так");
        }
        System.out.println("Результат = " + result);
        logger.info("Результат = "+ result);
    }
}

