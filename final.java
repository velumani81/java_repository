//import java.util.Scanner;
public class final {
  public static void main(String[] args) {
   Scanner readme = new Scanner(System.in);
   System.out.println("Enter Two Numbers (Press Enter after each):");
   //two variables to hold numbers
   double n1, n2, n3;
   n1 = readme.nextDouble();
   n2 = readme.nextDouble();
   n3 = n1 + n2;
   System.out.println("Total = " + n3);
  }
}