import java.util.Random;

//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
//        0x000000
//        0000x000
//        00x00000
public class Hm5_3Slon {
    public static void main(String[] args) {
        int size = 8;
        String[][] chahmate = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 8; j++) {
                chahmate[i][j] = "0";
            }
        }
        for (int i = 0; i < size; i++) {
            RunOnLine(chahmate, i);
        }
        PrintChah(chahmate);
    }

    private static void PrintChah(String[][] chahmate) {
        for (int i = 0; i < chahmate.length; i++) {
            for (int j = 0; j < chahmate.length; j++) {
                System.out.print(chahmate[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static boolean SearchPlace(String[][] chahmate, int line, int stolb) {
        int j = stolb;
        int size = chahmate.length;
        if (stolb == 0) {
            for (int i = line; i >= 0 && j < size - 1; i--) {
                if ((chahmate[i][j]).equals("x")) return false;
                j++;

            }
            for (int i = line; i < size - 1 && j < size - 1; i++) {
                if ((chahmate[i][j]).equals("x")) return false;
                j++;

            }
            j = stolb;
//            for (int i = line; i >= 0; i--) {
//                if ((chahmate[i][j]).equals("x")) return false;
//            }

        } else if (line == 0) {
            for (int i = line; i < size -1  && j >= 0; i++) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
            j = stolb;
            for (int i = line; i < size - 1 && j < size-1; i++) {
                if ((chahmate[i][j]).equals("x")) return false;
                j++;

            }
        } else if (stolb == size && line == size) {
            for (int i = line; i >= 0 && j >= 0; i--) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
        } else if (stolb == size) {
            for (int i = line; i >= 0 && j >= 0; i--) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
            j = stolb;
            for (int i = line; i < size && j >= 0; i++) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
//            j = stolb;
//            for (int i = line; i >= 0; i--) {
//                if ((chahmate[i][j]).equals("x")) return false;
//            }
        } else if (line == size) {
            for (int i = line; i >= 0 && j >= 0; i--) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
             j = stolb;
            for (int i = line; i >= 0 && j >= 0; i--) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
//            j = stolb;
//            for (int i = line; i >= 0; i--) {
//                if ((chahmate[i][j]).equals("x")) return false;
//            }
        } else {
             j = stolb;
            for (int i = line; i >= 0 && j >= 0; i--) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
             j = stolb;
            for (int i = line; i >= 0 && j < size-1; i--) {
                if ((chahmate[i][j]).equals("x")) return false;
                j++;

            }
             j = stolb;
            for (int i = line; i < size-1 && j >= 0; i++) {
                if ((chahmate[i][j]).equals("x")) return false;
                j--;

            }
            j = stolb;
            for (int i = line; i < size-1 && j < size-1; i++) {
                if ((chahmate[i][j]).equals("x")) return false;
                j++;

            }
//            j = stolb;
//            for (int i = line; i >= 0; i--) {
//                if ((chahmate[i][j]).equals("x")) return false;
//            }
        }
        return true;
    }

    private static void RunOnLine(String[][] chahmate, int i) {
        while (true) {
            Random rand = new Random();
            Integer j = rand.nextInt(0, 8);
//            for (int j = 0; j < chahmate.length; j++) {
                if (SearchPlace(chahmate, i, j)) {
                    chahmate[i][j] = "x";
                    break;
//                }
            }

        }
    }
}
