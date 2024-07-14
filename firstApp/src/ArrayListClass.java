import java.util.ArrayList;

public class ArrayListClass {
    
    public static void main (String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 100; i+=2) {
            list.add(i);
        }

        for (int num : list) {
            System.out.println(num);
        }

        System.out.println(list);
    }
}
