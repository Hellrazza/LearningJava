public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age) {
        this(name, age, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {return this.name;}
    public int getAge() {return this.age;}

    public String toString() {
        String years = " years";
        if (this.age == 1) {
            years = " year";
        }
        return this.name + ", " + this.age + years;
    }
}
