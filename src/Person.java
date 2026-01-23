public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
