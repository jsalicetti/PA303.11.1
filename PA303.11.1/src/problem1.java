import java.util.ArrayList;
import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {
        Integer [] holder = {12,0,1,78,12};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(holder));
        list.add(5,23);
        list.remove(0);
        System.out.println(list);

    }
}