public class LoopTest {
   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      LoopTest me = new LoopTest();
      me.doStuff();
   }
   // add your code here...
   public void doStuff() {
      System.out.println(powerOf2A(3));
      System.out.println(powerOf2B(3));
      System.out.println(powerOf2C(3));

      System.out.println(powerOf2A(0));
      System.out.println(powerOf2B(0));
      System.out.println(powerOf2C(0));

      printLineA(5);
      printLineB(5);
      printLineC(5);
   }
   // These functions compute powers of two.
   public int powerOf2A(int n) {
      int counter = n;
      int result  = 1;
      while (counter != 0) {
         result = 2 * result;
         counter--;
      }
      return result;
   }
   public int powerOf2B(int n) {
      if (n == 0) return 1;
      int counter = n;
      int result  = 1;
      do {
         result = 2 * result;
         counter--;
      } while (counter != 0);
      return result;
   }
   public int powerOf2C(int n) {
      int counter;
      int result;
      for (counter = n, result = 1; counter != 0; counter--) {
         result = 2 * result;
      }
      return result;
   }
   /**
     *  Prints a row of stars of a given length.
     */
   public void printLineA(int length) {
      int counter = length;
      while (counter != 0) {
         System.out.print("#");
	 counter--;
      }
      System.out.println();
   }

   public void printLineB(int length) {
      if (length == 0) return;
      int counter = length;
      do {
         System.out.print("#");
	 counter--;
      } while (counter != 0 );
      System.out.println();
   }

   public void printLineC(int length) {
      for (int i=0; i<length; i++) {
         System.out.print("#");
      }
      System.out.println();
   }
}
