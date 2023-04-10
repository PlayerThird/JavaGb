import java.util.Random;

//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
//        0x000000
//        0000x000
//        00x00000
public class Hm5_3Ferz {
    public static void main(String[] args) {
        int size = 8;
        int count = 0;
        String[][] chahmate = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                chahmate[i][j] = "0";
            }
        }
        while (true) {
            count = 0;
            StartSearch(chahmate, size);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (chahmate[i][j] == "x") {
                        count++;
                        break;
                    }
                }
            }
            PrintChah(chahmate);
            System.out.println("------------");
            if (count == 8) break;

        }
        PrintChah(chahmate);
    }

    private static void StartSearch(String[][] chahmate, int size) {
        for (int i = 0; i < size; i++) {
            if (!RunOnLine(chahmate, i)) {
                break;
            }
        }
    }

    private static void PrintChah(String[][] chahmate) {
        for (int i = 0; i < chahmate.length; i++) {
            for (int j = 0; j < chahmate.length; j++) {
                System.out.print(chahmate[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean SearchPlace(String[][] chahmate, int line, int stolb) {
        int j = stolb;
        int size = chahmate.length;
        if (stolb == 0) {//левая стена
            j = stolb;
            for (int i = line; i >= 0; i--) {//вверх
                if ((chahmate[i][j]).equals("x")) return false;
            }
            j = stolb;
            for (int i = line; i >= 0 && j < size; i--) {//право-вверх
                if ((chahmate[i][j]).equals("x")) return false;
                j++;
            }
            j = stolb;
            for (int i = line; i < size && j < size; i++) {//право-вниз
                if ((chahmate[i][j]).equals("x")) return false;
                j++;
            }


        } else if (line == 0) {//верхняя строка
            j = stolb;
            for (int i = line; i < size && j >= 0; i++) {//лево-вниз
                if ((chahmate[i][j]).equals("x")) return false;
                j--;
            }
            j = stolb;
            for (int i = line; i < size - 1 && j < size; i++) {//право-вниз
                if ((chahmate[i][j]).equals("x")) return false;
                j++;
            }
        } else if (stolb == size && line == size) {//нижний правый угол
            j = stolb;
            for (int i = line; i >= 0; i--) {//вверх
                if ((chahmate[i][j]).equals("x")) return false;
            }
            j = stolb;
            for (int i = line; i >= 0 && j >= 0; i--) {//лево - вверх
                if ((chahmate[i][j]).equals("x")) return false;
                j--;
            }

        } else if (stolb == size) {// у правой стены
            j = stolb;
            for (int i = line; i >= 0; i--) {//вверх
                if ((chahmate[i][j]).equals("x")) return false;
            }
            j = stolb;
            for (int i = line; i >= 0 && j >= 0; i--) {//лево-вверх
                if ((chahmate[i][j]).equals("x")) return false;
                j--;
            }
            j = stolb;
            for (int i = line; i < size && j >= 0; i++) {//лево-вниз
                if ((chahmate[i][j]).equals("x")) return false;
                j--;
            }

        } else if (line == size) {//последняя строка
            j = stolb;
            for (int i = line; i >= 0; i--) {//вверх
                if ((chahmate[i][j]).equals("x")) return false;
            }
            j = stolb;
            for (int i = line; i >= 0 && j >= 0; i--) {//лево-вверх
                if ((chahmate[i][j]).equals("x")) return false;
                j--;
            }
            j = stolb;
            for (int i = line; i >= 0 && j < size; i--) {//право-вверх
                if ((chahmate[i][j]).equals("x")) return false;
                j++;
            }

        } else { // где-то не у краёв
            j = stolb;
            for (int i = line; i >= 0; i--) {//вверх
                if ((chahmate[i][j]).equals("x")) return false;
            }
            j = stolb;
            for (int i = line; i >= 0 && j >= 0; i--) {//лево-вверх
                if ((chahmate[i][j]).equals("x")) return false;
                j--;
            }
            j = stolb;
            for (int i = line; i >= 0 && j < size; i--) {//право - вверх
                if ((chahmate[i][j]).equals("x")) return false;
                j++;
            }
            j = stolb;
            for (int i = line; i < size && j >= 0; i++) {//лево-вниз
                if ((chahmate[i][j]).equals("x")) return false;
                j--;
            }
            j = stolb;
            for (int i = line; i < size && j < size - 1; i++) {//право-вниз
                if ((chahmate[i][j]).equals("x")) return false;
                j++;
            }

        }
        return true;
    }

    private static boolean RunOnLine(String[][] chahmate, int i) {

        for (int j = 0; j < chahmate.length; j++) {
            if (chahmate[i][j] == "x") {
                chahmate[i][j] = "0";
            }
        }

        while (true) {
            Random rand = new Random();
            for (int k = 0; k < chahmate.length; k++) {
                Integer j = rand.nextInt(0, 8);
                if (SearchPlace(chahmate, i, j)) {
                    chahmate[i][j] = "x";
                    return true;
                } else RunOnLine(chahmate,i-1);
            }

        }
    }
}

