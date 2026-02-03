import java.util.HashMap;


public class HashMapExercises {
    public static void main(String[] args) {
        ProgramExercise();
    }

    public static void NicknameExercise() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Matthew","Matt");
        hashMap.put("Michael","Mix");
        hashMap.put("Arthur","Archie");

        System.out.println(hashMap.get("Arthur"));
    }

    public static void BookExercise() {
        HashMap<String, Book> bookMap = new HashMap<>();
        Book book1 = new Book(1, "Of mice and men", 1937);
        Book book2 = new Book(2, "Sense and sensibility" , 1816);
        Book book3 = new Book(3, "Pride and prejudice", 1813);

        bookMap.put(book1.getTitle(),book1);
        bookMap.put(book2.getTitle(),book2);
        bookMap.put(book3.getTitle(),book3);

        System.out.println(bookMap.get("Of mice and men"));
    }

    public static void LibraryExercise() {
        Book sense = new Book(1, "Sensibility", 1816 );
        Book pride = new Book(2, "Pride", 1812);
        Library library = new Library();

        library.addBook(sense);
        library.addBook(pride);

        System.out.println(library.getBook("PRIDE"));
        System.out.println(library.getBook("            Sensibility         "));
        System.out.println(library.getBook("SENSE"));
    }

    public static void AbbreviationExercise() {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }

    public static void ProgramExercise() {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        Program.printHashKeys(hashmap);
        System.out.println("---");
        Program.PrintHashKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.PrintValueOfKeyWhere(hashmap, ".e");
    }
}
