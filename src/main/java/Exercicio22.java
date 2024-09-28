// IMPORTS

import java.util.Scanner;

public class Exercicio22 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      int s = 0;
      int e = 0;
      int sum = 0;
      int cnt = 0;

      // COLLECT DATA
      System.out.print("START : ");
      s = sc.nextInt();
      System.out.print("END : ");
      e = sc.nextInt();

      // OUTPUT
      for (int i = s; i <= e; i++) {
         sum += i;
         cnt++;
      }

      System.out.print("AVERAGE: " + (sum / cnt));
   }
}
