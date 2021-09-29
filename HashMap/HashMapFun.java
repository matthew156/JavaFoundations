import java.util.*;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Hero", "Skillet");
        userMap.put("Humble", "Kendrick Lamar");
        userMap.put("Rockstar", "Nickleback");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);    
        }
    }
}




