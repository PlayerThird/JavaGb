import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//        результат после каждой итерации запишите в лог-файл.
public class Hm2_1Old {
    public static void main(String[] args) {
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
            writeInFile(arrNew, "Заполнение");
        }

        for (int j = 1; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if (arrNew[j] < arrNew[k]) {
                    temp = arrNew[j];
                    arrNew[j] = arrNew[k];
                    arrNew[k] = temp;
                    count++;
                    countInFile = Integer.toString(count);
                    writeInFile(arrNew, countInFile);
                }
            }
        }
        sc.close();
        for (int string : arrNew) {
            System.out.println(string + " ");
        }

    }

    private static void writeInFile(int[] arrNew, String message) {
        File file = new File("Hm2_1.txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            StringBuilder stringToWrite = new StringBuilder();
            for (int string : arrNew) {
                stringToWrite.append(string);
            }
            writer.append(message + " -- ");
            writer.append(stringToWrite);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
