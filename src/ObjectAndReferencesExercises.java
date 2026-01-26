public class ObjectAndReferencesExercises {
   public static void main(String[] args) {
       apartmentExercise();
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

   public static void apartmentExercise() {
       Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
       Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
       Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

       System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
       System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

       System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
       System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));
   }

}
