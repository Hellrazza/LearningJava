import java.util.*;

public class InterfaceExercises {
    public static void main(String[] args) {
        MapExercise();
    }

    public static void CDComicExercise() {
        PackableBox box = new PackableBox(10);
        PackableBox box2 = new PackableBox(20);
        box.add(new Comic("Ghost Rider", "Marvel", 1));
        box.add(new Comic("Batman", "DC", 2.5));
        box.add(new Comic("Call of Duty Zombies", "Dark Horse", 1));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);

        box2.add(box);
        box2.add(new CD("Scatman John", "Scatman's World", 1998));
        System.out.println(box2);
    }

    public static void ListExercise() {
        List<String> names = new ArrayList<>();
        names.add("Ryan");
        names.add("Stan");
        names.add("Johnny");

        System.out.println(returnSize(names));
    }

    public static int returnSize(List<String> names) {
        return names.size();
    }

    public static void MapExercise() {
        Map<String, String> names = new HashMap<>();
        names.put("1","First");
        names.put("2","Second");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Map<String, String> names) {
        return names.size();
    }

    public static void SetExercise() {
        Set<String> names = new HashSet<>();
        names.add("Hello");
        names.add("Hello");
        names.add("Hello");
        names.add("Hello");
        names.add("Hello");
        names.add("Hello");

        names.add("Goodbye");
        names.add("Goodbye");
        names.add("Goodbye");
        names.add("Goodbye");
        names.add("Goodbye");
        names.add("Goodbye");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Set<String> names) {
        return names.size();
    }

}