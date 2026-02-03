import java.util.HashMap;

public class Program {
    public static void printHashKeys(HashMap<String, String> hashMap) {
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void PrintHashKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String key : hashMap.keySet()) {
            if (!key.contains(text)) {
                continue;
            }
            System.out.println(key);
        }
    }

    public static void PrintValueOfKeyWhere(HashMap<String, String> hashMap, String text) {
        for (String key : hashMap.keySet()) {
            if (!key.contains(text)) {
                continue;
            }
            System.out.println(hashMap.get(key));
        }
    }
}
