import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter a string: ");
  String input = scanner.nextLine();

  int countA = 0;
  int countE = 0;
  int countI = 0;
  int countO = 0;
  int countU = 0;
  int nonVowelCount = 0;

  for (int i = 0; i < input.length(); i++) {
   byte letter = (byte) input.charAt(i); 

  if (letter == 'a') {
    countA++;
  } else if (letter == 'e') {
    countE++;
  } else if (letter == 'i') {
    countI++;
  } else if (letter == 'o') {
    countO++;
  } else if (letter == 'u') {
    countU++;
  } else if (letter >= 'a' && letter <= 'z') { 
    nonVowelCount++;
  }
  }

  System.out.println("Vowel counts:");
  System.out.println("a: " + countA);
  System.out.println("e: " + countE);
  System.out.println("i: " + countI);
  System.out.println("o: " + countO);
  System.out.println("u: " + countU);
  System.out.println("Non-vowel characters: " + nonVowelCount);
    scanner.close();
    }
}

