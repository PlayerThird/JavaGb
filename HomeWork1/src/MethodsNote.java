import java.util.*;

public class MethodsNote {

    public static void mainMenu(HashSet<NouteBooke> nouts) {
        System.out.println("Выбирете по какому фильтру вам подобрать ноут:" +
                "\n1) ОС" +
                "\n2) Цвет" +
                "\n3) Оперативка" +
                "\n4) ОЗУ");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        switch (choise){
            case 1 -> searchOS(nouts);
            case 2 -> searchColor(nouts);
            case 3 -> searchVolume(nouts);
            case 4 -> searchOzu(nouts);
        }
    }


    private static void searchOzu(HashSet<NouteBooke> nouts) {
        System.out.println("Вот какие варианты мы нашли:");
        HashMap<Integer,String> manyOs = new HashMap<>();
        int index = 1;
        for (var item: nouts){
            if (!manyOs.containsValue(item.ozu)){
                manyOs.put(index,item.
                        ozu);
                index++;
            }
        }
        for (var oses : manyOs.entrySet()){
            System.out.println(oses);
        }
        System.out.println("Что вы конкретно хотите найти?");
        Scanner sc =new Scanner(System.in);
        int searchOnOs = sc.nextInt();
        System.out.println("Вот что мы нашли:");
        for (var item: nouts){
            if (item.equalOzu(manyOs.get(searchOnOs))){
                System.out.println(item);
            }
        }

    }

    private static void searchVolume(HashSet<NouteBooke> nouts) {
        System.out.println("Вот какие варианты мы нашли:");
        HashMap<Integer,Integer> manyOs = new HashMap<>();
        int index = 1;
        for (var item: nouts){
            if (!manyOs.containsValue(item.volume)){
                manyOs.put(index,item.volume);
                index++;
            }
        }
        for (var oses : manyOs.entrySet()){
            System.out.println(oses);
        }
        System.out.println("Что вы конкретно хотите найти?");
        Scanner sc =new Scanner(System.in);
        int searchOnOs = sc.nextInt();
        System.out.println("Вот что мы нашли:");
        for (var item: nouts){
            if (item.equalVolume(manyOs.get(searchOnOs))){
                System.out.println(item);
            }
        }
    }

    private static void searchColor(HashSet<NouteBooke> nouts) {
        System.out.println("Вот какие варианты мы нашли:");
        HashMap<Integer,String> manyOs = new HashMap<>();
        int index = 1;
        for (var item: nouts){
            if (!manyOs.containsValue(item.color)){
                manyOs.put(index,item.color);
                index++;
            }
        }
        for (var oses : manyOs.entrySet()){
            System.out.println(oses);
        }
        System.out.println("Что вы конкретно хотите найти?");
        Scanner sc =new Scanner(System.in);
        int searchOnOs = sc.nextInt();
        System.out.println("Вот что мы нашли:");
        for (var item: nouts){
            if (item.equalColor(manyOs.get(searchOnOs))){
                System.out.println(item);
            }
        }
    }

    private static void searchOS(HashSet<NouteBooke> nouts) {
        System.out.println("Вот какие варианты мы нашли:");
        HashMap<Integer,String> manyOs = new HashMap<>();
        int index = 1;
        for (var item: nouts){
            if (!manyOs.containsValue(item.OS)){
                manyOs.put(index,item.OS);
                index++;
            }
        }
        for (var oses : manyOs.entrySet()){
            System.out.println(oses);
        }
        System.out.println("Что вы конкретно хотите найти?");
        Scanner sc =new Scanner(System.in);
        int searchOnOs = sc.nextInt();
        System.out.println("Вот что мы нашли:");
        for (var item: nouts){
            if (item.equalOS(manyOs.get(searchOnOs))){
                System.out.println(item);
            }
        }
    }

    public static HashSet<NouteBooke> SaveAll() {
        NouteBooke note1 = new NouteBooke();
        note1.id = 1;
        note1.color = "dark";
        note1.ozu = "Pentium";
        note1.volume = 20;
        note1.OS = "Winda";
        NouteBooke note2 = new NouteBooke();
        note2.id = 2;
        note2.color = "red";
        note2.ozu = "Intel";
        note2.volume = 100;
        note2.OS = "Android";
        NouteBooke note3 = new NouteBooke();
        note3.id = 3;
        note3.color = "green";
        note3.ozu = "Pentium";
        note3.volume = 50;
        note3.OS = "Linux";
        NouteBooke note4 = new NouteBooke();
        note4.id = 4;
        note4.color = "red";
        note4.ozu = "Asus";
        note4.volume = 40;
        note4.OS = "Winda";
        NouteBooke note5 = new NouteBooke();
        note5.id = 5;
        note5.color = "blue";
        note5.ozu = "Intel";
        note5.volume = 20;
        note5.OS = "Linux";
        NouteBooke note6 = new NouteBooke();
        note6.id = 6;
        note6.color = "blue";
        note6.ozu = "Asus";
        note6.volume = 20;
        note6.OS = "Android";
        NouteBooke note7 = new NouteBooke();
        note7.id = 7;
        note7.color = "green";
        note7.ozu = "Intel";
        note7.volume = 50;
        note7.OS = "Winda";
        NouteBooke note8 = new NouteBooke();
        note8.id = 8;
        note8.color = "red";
        note8.ozu = "Intel";
        note8.volume = 100;
        note8.OS = "Linux";
        NouteBooke note9 = new NouteBooke();
        note9.id = 9;
        note9.color = "dark";
        note9.ozu = "Asus";
        note9.volume = 20;
        note9.OS = "Android";
        NouteBooke note10 = new NouteBooke();
        note10.id = 10;
        note10.color = "blue";
        note10.ozu = "Pentium";
        note10.volume = 40;
        note10.OS = "Winda";

        var nouts = new HashSet<NouteBooke>(Arrays.asList(note1,note2,note3,note4,note5,note6,note7,note8,note9,note10));
        return nouts;
    }
}
