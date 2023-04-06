import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//        результат после каждой итерации запишите в лог-файл.
public class Hm2_1New {
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("Hm2_1Log.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        Integer size = sc.nextInt();
        int[] arrNew = new int[size];
        int temp = 0;
        int count = 0;
        String countInFile = new String();
        System.out.println("Заполните массив размером " + size);

        for (int i = 0; i < size; i++) {
            arrNew[i] = sc.nextInt();
            writeInFile(arrNew, "Заполнение", fh);
        }

        for (int j = 1; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (arrNew[j] < arrNew[k]) {
                    temp = arrNew[j];
                    arrNew[j] = arrNew[k];
                    arrNew[k] = temp;
                    count++;
                    countInFile = Integer.toString(count);
                    writeInFile(arrNew, countInFile, fh);
                }
            }
        }
        sc.close();
        for (int string : arrNew) {
            System.out.println(string + " ");
        }

    }

    private static void writeInFile(int[] arrNew, String message, FileHandler fh) {
        File file = new File("Hm2_1New.txt");
        Logger logger = Logger.getLogger(Hm2_1New.class.getName());

        try (FileWriter writer = new FileWriter(file, true)) {

            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            StringBuilder stringToWrite = new StringBuilder();
            for (int string : arrNew) {
                stringToWrite.append(string);
            }
            writer.append(stringToWrite);
            writer.append('\n');
            logger.info(message+ " "+ stringToWrite);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
