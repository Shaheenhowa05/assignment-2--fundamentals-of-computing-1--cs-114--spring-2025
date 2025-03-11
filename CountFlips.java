public class CountFlips {
  public static void main(String[] args) 
  {
  Coin coin = new Coin();
  int headsCount = 0;
  int tailsCount = 0;

  System.out.println("Coins flipping....");

  for (int i = 0; i < 100; i++) {
    coin.flip();
  if (coin.isHeads()) {
    headsCount++;
    }
  else {
    tailsCount++;
    }
    }

    System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
  }
}
