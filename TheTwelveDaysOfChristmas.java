public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    String[] gifts = {
      "A partridge in a pear tree.",
      "Two turtle doves, and",
      "Three French hens,",
      "Four calling birds,",
      "Five golden rings,",
      "Six geese a-laying,",
      "Seven swans a-swimming,",
      "Eight maids a-milking,",
      "Nine ladies dancing,",
      "Ten lords a-leaping,",
      "Eleven pipers piping,",
      "Twelve drummers drumming,"
  };

  for (int day = 1; day <= 12; day++) {
    String daySuffix = getDaySuffix(day);
      System.out.println("On the " + day + daySuffix + " day of Christmas my true love gave to me");

      for (int i = day - 1; i >= 0; i--) {
          System.out.println(gifts[i]);
      }

      System.out.println();
  }
}

private static String getDaySuffix(int day) {
  String suffix = "th";
  if (day == 1) {
      suffix = "st";
  }
  if (day == 2) {
      suffix = "nd";
  }
  if (day == 3) {
      suffix = "rd";
  }
  return suffix;
}
}

