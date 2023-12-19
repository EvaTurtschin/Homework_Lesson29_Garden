package garden;

import java.util.Scanner;

public class Garden {
       public static void main(String[] args) {

       Plant tulip = new Flower("Tulip", 0, 0);
       Plant pineTree = new Tree("Pine Tree", 0, 0);

              Scanner scanner = new Scanner(System.in);
              System.out.println("To get information, enter the number of years: ");
              int pastYears = scanner.nextInt();

       pineTree.growPlantDuringPastYears(pastYears);
              System.out.println();
       tulip.growPlantDuringPastYears(pastYears);
              System.out.println();
       tulip.measureHeight(pastYears);
       pineTree.measureHeight(pastYears);


}}
