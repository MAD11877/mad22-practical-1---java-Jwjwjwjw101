import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int rows = in.nextInt();
    in.close();

    for(int i = rows; i >= 1; i--)
    {
      for(int m = 1; m <= i; m++)
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }

    
  }
}
