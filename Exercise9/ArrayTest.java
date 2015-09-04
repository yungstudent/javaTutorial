class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];

      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }

      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }

      // insert your code for the nums array here:

      // create nums array
      double[] nums = new double[10];

      // set values of nums array
      for (int i=0; i<10; i++) {
         nums[i] = 1 + i*0.1;
      }

      // print values of nums array
      for(int i=0; i<10; i++){
         System.out.println(nums[i]);
      }

      // print nums array using ArrayPrint
      ArrayPrint.printArray(nums);

      // print nums array printArray method
      printArray(nums);
   }

   public void printArray(double[] anArray) {
      for(int i=0; i<anArray.length; i++){
         System.out.println(anArray[i]);
      }
   }
}
