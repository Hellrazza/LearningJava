public class ObjectAndReferencesExercises {
   public static void main(String[] args) {
       moneyExercise();
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

       System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
       System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
   }

   public static void petExercise() {
       Pet shite = new Pet("Shite", "Call duck");
       Person jackson = new Person("Jackson", shite);

       System.out.println(jackson);
   }

   public static void songExercise() {
       Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
       Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

       if (jackSparrow.equals(anotherSparrow)) {
           System.out.println("Songs are equal.");
       }

       if (jackSparrow.equals("Another object")) {
           System.out.println("Strange things are afoot.");
       }
   }

   public static void personExercise() {
       SimpleDate date = new SimpleDate(24, 3, 2017);
       SimpleDate date2 = new SimpleDate(23, 7, 2017);

       Person leo = new Person("Leo", date, 62, 9);
       Person lily = new Person("Lily", date2, 65, 8);

       if (leo.equals(lily)) {
           System.out.println("Is this quite correct?");
       }

       Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

       if (leo.equals(leoWithDifferentWeight)) {
           System.out.println("Is this quite correct?");
       }
   }

   public static void moneyExercise() {
       Money a = new Money(10, 0);
       Money b = new Money(3, 50);

       Money c = a.minus(b);

       System.out.println(a);  // 10.00e
       System.out.println(b);  // 3.50e
       System.out.println(c);  // 6.50e

       c = c.minus(a);


       System.out.println(a);  // 10.00e
       System.out.println(b);  // 3.50e
       System.out.println(c);  // 0.00e
   }

}
