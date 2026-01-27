public class Person {
    private String name;
    private int age;
    private SimpleDate dob;
    private int height;
    private int weight;
    private Pet pet;

    public Person(String name, int age) {
        this(name, age, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, SimpleDate dob, int height, int weight) {
        this.name = name;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {return this.name;}
    public int getAge() {return this.age;}

    public void growOlder() {
        this.age++;
    }

    public void gainWeight(int totalWeightGained) {
        this.weight += totalWeightGained;
    }

    public int getWeight() {return weight;}

    public String toString() {
//        String years = " years";
//        if (this.age == 1) {
//            years = " year";
//        }
//        return this.name + ", " + this.age + years;

        return name + " has a friend called " + pet;
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }

        if(!(other instanceof Person)) {
            return false;
        }

        Person personOther = (Person) other;

        return name.equals(personOther.name) && dob.equals(personOther.dob) && height == personOther.height && weight == personOther.weight;

    }


}
