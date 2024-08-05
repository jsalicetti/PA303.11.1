import java.util.HashMap;
import java.util.Map;

public class problem2 {
    public static void main(String[] args) {
        Map <String, Integer> phoneNumbers = new HashMap<String, Integer>();
        phoneNumbers.put("uncle sam",99912222);
        phoneNumbers.put("tom", 11122222);
        phoneNumbers.put("harry", 12299933);

        if(phoneNumbers.get("uncle sam") == null){
            System.out.println("Not found");
        }else  System.out.println("uncle sam = " + phoneNumbers.get("uncle sam"));

        if(phoneNumbers.get("uncle tom") == null){
            System.out.println("Not found");
        } else System.out.println("uncle tom = " + phoneNumbers.get("uncle tom"));

        if(phoneNumbers.get("harry") == null){
            System.out.println("Not found");
        }else System.out.println("harry = " + phoneNumbers.get("harry"));
    }
}