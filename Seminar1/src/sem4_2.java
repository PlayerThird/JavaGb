import java.util.LinkedList;
import java.util.Scanner;

public class sem4_2 {
    public static void main(String[] args) {
        LinkedList<String> strArr = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        Integer index = 0;
        while (true){
            input = sc.next();
            if (input.equals("stop")){
                break;
            }
            if (input.split("~")[0].equals("print")) {
                index = Integer.parseInt(input.split("~")[1]);
                System.out.println(strArr.get(index-1));
                strArr.remove(index-1);
            }
            else {
                strArr.add(input);
            }
            System.out.println("\n");
            for (String string : strArr){
                System.out.println(string + " ");
            }
            sc.close();
        }
    }
}
