public class Iffy {
   private int anIntProp = 42;
   public static void main(String[] args) {
      Iffy me = new Iffy();
      me.callSomeMethods();
   }

   public void callSomeMethods() {
      // add statements here to exercise the other methods ...
      warnIfNegative(-1);
      warnIfNegative(0);
      warnIfNegative(1);
      // Non negative numbers trigger a warning

      resetIfNegative();
      System.out.println("Value of integer property is: " + anIntProp);
      // A positive value is also reset

      System.out.println("3 is between 1 and 5: " + isInRange(3,5,1));
      System.out.println("7 is between 1 and 5: " + isInRange(7,5,1));
      System.out.println("0 is between 1 and 5: " + isInRange(0,5,1));

      // trigger upper bound check
      isInRange(1,1,5);
   }

   /**
    * Print out a warning if the value is negative
    * otherwise don't do anything.
    */
   public void warnIfNegative(int theValue) {
      if(theValue < 0) {
         System.out.println("Caution - negative value given (" + theValue + ")");
      }
   }
  
   /**
    * Print out a warning if the value of anIntProp is negative
    * and also set the value to zero.
    * Otherwise don't do anything.
    */
   public void resetIfNegative() {
      if(anIntProp < 0) {
         System.out.println("Caution - negative value given (" + anIntProp + ")");
      	 anIntProp = 0;
      }
   }

   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
   public boolean isInRange(int value, int upperBound, int lowerBound) {
      if (upperBound <= lowerBound) {
	System.out.println("Caution - upper bound is smaller than or equal to lower bound"); 
      }
      return (lowerBound <= value && value <= upperBound );
   }

   //public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
   //  what goes here?
   //}
}
