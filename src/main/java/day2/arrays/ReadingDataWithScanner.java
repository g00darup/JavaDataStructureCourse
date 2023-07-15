package day2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingDataWithScanner{
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int length = scanner.nextInt();
      int [] arr = new int[length];
      System.out.println("Enter the elements of the array:");

      for(int i=0; i<length; i++ ) {
         arr[i] = scanner.nextInt();
      }

      System.out.println(Arrays.toString(arr));
   }
}