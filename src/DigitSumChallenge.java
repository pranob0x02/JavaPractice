public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Total of number 1234 is: " + sumDigits(1234));
        System.out.println("Total of number -1 is: " + sumDigits(-1));
    }

    public static int sumDigits(int num) {
        int sum = 0;
        if (num < 0) {
            return -1;
        }

        while (num > 9) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        sum = sum + num;
        return sum;
    }
}

/* -------- For Loop -----------
 *  for(init; expression; increment){
        //block of statement
    }

 * -------- While Loop ---------
 *  while (expression){
 *      //block of statement
 *  }
 *
 *  int i = 1;
 *  while (true){
 *      if (i > 5){
 *          break;
 *      }
 *      System.out.println(i);
 *      i++;
 *  }
 *
 * --------- Do While Loop -----------
 *  do {
 *      // block of statement
 *  } while (expression);
 *
 * // do while loop always executes atlatest once.
 *
 *
 *
 */
