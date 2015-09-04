/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader. 
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readAge () throws IOException {
    int validInput = 0;

    while (validInput == 0) {
      System.out.print("Input your age: ");
      try {
          age = Integer.parseInt(stdIn.readLine());
          if (age >= 0 && age <= 150){
             validInput = 1;
	  }
	  else {
	     System.out.println("Please enter a number in the range 0 to 150.");
          }
      }
      catch (IOException exception) {
          System.out.println("Something went wrong.");
          System.exit(0); 
      }
      catch (NumberFormatException exception) { 
  	  age = -1;
          System.out.println("That is not a number, please try again."); 
      }
    }
  }

  public void printAge (){
    System.out.println("Age: " + age);
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
    

  public void printName () {
    System.out.println("Name: " + name);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();
    me.readAge();
    me.printAge();
  }
}

  
  
