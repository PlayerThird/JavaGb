import java.io.File;

import java.io.FileReader;
import java.io.*;



//Дана строка (получение через обычный текстовый файл!!!)
//
//        "фамилия":"Иванов","оценка":"5","предмет":"Математика"
//        "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//
//        Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет].
//
//        Пример вывода в консоль:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.
public class Hm2_2 {
    public static void main(String[] args) throws IOException {

        String line = "empty";
        String path = "Hm2_2.txt";
        File file = new File(path);
        BufferedReader bufReader = new BufferedReader(new FileReader(path));
        FileReader readFile = new FileReader(path);
        char[] a = new char[(int) file.length()];
        readFile.read(a);
        int count = 0;
        char znak = '\n';
        for (char c : a) {
            if (c == znak) {
                count++;
            }
        }
        for (int i = 0; i < count + 1; i++) {
            line = bufReader.readLine();
            OneLine(line);
        }
    }

    static void OneLine(String line) {
        StringBuilder outInfo = new StringBuilder();
        System.out.println(line);//для проверки
        String[] arrayLine = line.split(":");
        arrayLine = line.split(",");
        String name = new String();
        String count = new String();
        String object = new String();
        for (int i = 0; i < 3; i++) {
            String[] forParse = arrayLine[i].split(":");
            switch (i) {
                case 0 -> name = forParse[1];
                case 1 -> count = forParse[1];
                case 2 -> object = forParse[1];
                default -> {
                    return;
                }
            }
        }
        outInfo.append("Ученик ");
        outInfo.append(name);
        outInfo.append(" получил ");
        outInfo.append(count);
        outInfo.append(" по предмету ");
        outInfo.append(object);
        System.out.println(outInfo);
    }
}


