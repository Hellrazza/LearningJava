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

    public static void PrintValues(HashMap<String, Book> hashMap) {
        for (Book book : hashMap.values()) {
            System.out.println(book);
        }
    }

    public static void PrintValuesIfNameContains(HashMap<String, Book> hashMap, String query) {
        query = SerialiseString(query);
        for (Book book : hashMap.values()) {
            if (SerialiseString(book.getTitle()).contains(query)) {
                System.out.println(book);
            }
        }

    }

    public static String SerialiseString(String string) {
        if (string == null) {
            string = "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
