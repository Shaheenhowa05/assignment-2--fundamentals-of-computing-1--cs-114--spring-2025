import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
        
       
  System.out.print("Enter the number of verses to print: ");
  int numVerses = scan.nextInt();
        
        
  if (numVerses <= 0) {
  System.out.println("Please enter a positive number.");
  scan.close();
  return;
  }
        

  for (int i = numVerses; i > 0; i--) {
  System.out.println(i + " bottles of beer on the wall");
  System.out.println(i + " bottles of beer");
  System.out.println("If one of those bottles should happen to fall");
  System.out.println((i - 1) + " bottles of beer on the wall\n");
  }
        
  
  }
}
