import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java_Math{

    public static void main(String args[]) {

    execute();
}

    public static double multiply(double x, double y){
        return (x * y);
    }
    
    public static double divide(double x, double y) {
        
        if (y == 0){
            System.out.println("Error: Cannot divide by zero");

            return 0;

        } else {
            return x / y;
        }
    }

    public static double circCircumference(double x) {

        final double PI = 3.14159265;

        return PI * x;

    }
    
    public static double circArea(double x) {

        final double PI = 3.14159265;

        return PI * x * x;

    } 

    public static void PressAnyKey() {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Press enter to return...");
    try {
      input.readLine();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

// Execute-------------------------------------------------------------------------------

    public static int execute(){
    
    System.out.print("\033[H\033[2J");

    System.out.println("Math Program\n© 2023 Balazs Fentor, All rights reserved\n");

    System.out.println("Pick Tool:\n\n1. Multiplication");    
    System.out.println("2. Division\n3. Circle Circumference\n4. Circle Area");
    System.out.println("5. Exit\n");

    Scanner inPut = new Scanner(System.in);
    
   int query = inPut.nextInt();
   
   if (query == 1) {
   
       System.out.println("Format: x * y\n");

       try {

       System.out.print("x= ");
       double x = inPut.nextDouble();
       System.out.print("y= ");
       double y = inPut.nextDouble();
   
       System.out.println(multiply(x, y));

        }

        catch (Exception InputMismatchException) {
            System.out.println("Error: Overflow");

            try {
            TimeUnit.SECONDS.sleep(1);
            }
            catch (Exception InterruptedException) {
                System.out.println("Caught");
            }

        }

        PressAnyKey();

        execute();

    } else if (query == 2) {
     
        System.out.println("Format: x / y\n");

        System.out.print("x= ");
        double x = inPut.nextDouble();
        System.out.print("y= ");
        double y = inPut.nextDouble();

        System.out.println(divide(x, y));

        PressAnyKey();

        execute();

    } else if (query == 3) {

        System.out.print("Diameter: ");

        double x = inPut.nextDouble();

        System.out.println(circCircumference(x));

        PressAnyKey();

        execute();

    } else if (query == 4) {

        System.out.print("Radius: ");

        double x = inPut.nextDouble();

        System.out.println(circArea(x));

        PressAnyKey();

        execute();

    } else if (query == 5) {
        return 0;
    }

    return 0;

// ---------------------------------------------------------------------------------------

}
}
