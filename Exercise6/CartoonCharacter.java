class CartoonCharacter {

   // Properties of the class...
   private String name;
   public String favouriteColour;
   private int    favouriteNumber;
   public static int count;

   // Constructor of the class...
   public CartoonCharacter(String aName, String aColour, int aNumber) {
      name            = aName;
      favouriteColour = aColour;
      favouriteNumber = aNumber;
      count++;
   }

   // Methods of the class...
   public void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
      System.out.println("Count is: " + count);
      System.out.println("Value of Pi is: " + Math.PI);
   }
}
