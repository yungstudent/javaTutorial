class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public  String name;
   private int    age;
   public  Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   // Methods of the class...
   public String toString() {
      return "I am a dog called " + name + ", I am " + age + " years old. My flea is called " + dogsFlea.name + ".";
   }

}

class DogOwner {
   // Properties of the class...
   private String name;
   private int    salary;
   public  Dog    ownersDog;

   // Constructor of the class...
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name      = aName;
      salary    = aSalary;
      ownersDog = aDog;
   }

   // Methods of the class...
   public String toString() {
      return "I am a dog owner called " + name + ". My salary is " + salary + ". My dog is called " + ownersDog.name;
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea p = new Flea("Pop");
      Flea s = new Flea("Squeak");
      Flea z = new Flea("Zip");

      Dog r = new Dog("Rex",2,p);
      System.out.println(r.toString());
      Dog j = new Dog("Jimbo",3,s);
      System.out.println(j.toString());
      Dog f = new Dog("Fido",5,z);
      System.out.println(f.toString());

      DogOwner a = new DogOwner("Angus",10000,r);
      DogOwner b = new DogOwner("Brian",15000,j);
      DogOwner c = new DogOwner("Carles",20000,f);

      System.out.println(a.toString());
      System.out.println(b.toString());
      System.out.println(c.toString()); 

      System.out.println(a.ownersDog.dogsFlea.toString());
   }
}

