import java.util.Scanner;

public class temperature {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
      boolean complete = false;
      String origin = "a";
      String destination = "a";
      while (complete == false) {
        System.out.print("Enter an origin scale: ");
        origin = in.nextLine();
        origin = origin.toUpperCase();
        if (origin.equals("F") || origin.equals("C") || origin.equals("K")) {
          complete = true;
        }
      }
      complete = false;
      while (complete == false) {
        System.out.print("Enter a destination scale: ");
        destination = in.nextLine();
        destination = destination.toUpperCase();
        if (destination.equals("F") || destination.equals("C") || destination.equals("K")) {
          complete = true;
        }
      }
      System.out.print("Enter a temperature: ");
      double temp = in.nextDouble();
      double newTemp = 5;
      if (origin.equals("F")) {
          if (destination.equals("C")) {
            newTemp = (temp - 32) * (5.0/9.0);
          } else if (destination.equals("K")) {
            newTemp = (temp - 32) * (5.0/9.0) + 273.15;
          }
        } else if (origin.equals("C")) {
          if (destination.equals("F")) {
            newTemp = (temp * (9.0/5.0) + 32);
          } else if (destination.equals("K")) {
            newTemp = temp + 273.15;
          }
        } else if (origin.equals("K")) {
          if (destination.equals("F")) {
            newTemp = (temp - 273.15) * (9.0/5.0) + 32;
          } else if (destination.equals("C")) {
            newTemp = temp - 273.15;
          }
      }
      System.out.printf("\n%.1f\u00b0" + origin + " equals " + "%.1f\u00b0" + destination, temp, newTemp);
    }
}
