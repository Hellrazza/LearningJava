public class ObjectAndReferencesExercises {
   public static void main(String[] args) {
       healthStationExercise();
   }

   public static void nullExercise() {
       Person ryan = new Person("Ryan", 23);
       System.out.println(ryan);

       ryan = null;

       ryan.growOlder();
   }

   public static void healthStationExercise() {
       HealthStation childrenHospital = new HealthStation();

       Person ethan = new Person("Ethan", 1, 110, 7);
       Person peter = new Person("Peter", 33, 176, 85);

       System.out.println("Weighings performed: " + childrenHospital.getTotalWeighings());

       childrenHospital.weigh(ethan);
       childrenHospital.weigh(peter);

       System.out.println("Weighings performed: " + childrenHospital.getTotalWeighings());

       childrenHospital.weigh(ethan);
       childrenHospital.weigh(ethan);
       childrenHospital.weigh(ethan);
       childrenHospital.weigh(ethan);

       System.out.println("Weighings performed: " + childrenHospital.getTotalWeighings());
   }

}
