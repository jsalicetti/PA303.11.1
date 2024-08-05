import java.util.HashSet;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < num; i++) {
            names.add(scan.nextLine());
            System.out.println(names.size());
        }
    }
}