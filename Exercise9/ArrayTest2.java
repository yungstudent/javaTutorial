class Human {

   // Properties of the class...
   String name;

   // Constructor of the class...
   public Human(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a human and my name is " + name;
   }
}

class ArrayTest2 {

   public static void main(String[] args) {
      ArrayTest2 x = new ArrayTest2();
      x.doStuff();
   }

   public void doStuff() {

      // insert your code here:
      
      // create object array threesome
      Human[] threesome = new Human[3];	   

      // add humans to threesome array
      threesome[0] = new Human("Angus");
      threesome[1] = new Human("Brian");
      threesome[2] = new Human("Charles");

      // print out humans in threesome
      for(int i=0; i<3; i++){
         System.out.println(threesome[i].toString());
      }

      printArray(threesome);
   }

   public void printArray(Human[] anArray) {
      for(int i=0; i<anArray.length; i++){
         System.out.println(anArray[i]);
      }
   }

}
