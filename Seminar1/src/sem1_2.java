public class sem1_2 {
    public static void main(String[] args) {
        int[] mas = new int[] {1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1};
        int count = 0;
        int maxCount = 0;
        for (int item: mas) {
            if (item == 1){
                count++;
                if (count> maxCount){ maxCount = count;
                    }
            } else {count = 0;}
        }
        System.out.println(maxCount);
    }
}
