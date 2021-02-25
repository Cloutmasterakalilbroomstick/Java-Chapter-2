import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Milestone 1
        Scanner alright = new Scanner(System.in);
        System.out.println("Enter a number");
        double enterNum = alright.nextDouble();
        if (enterNum % 2 == 0) {
            System.out.println("This is an even number!");
        }
        else {
            System.out.println("This is an odd number!");
        }





        // Milestone 2
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number that you're thinking of (in decimal): ");
        double num1 = scan.nextDouble();
        System.out.println(num1);
        System.out.println((int)num1);
        num1 = num1 -=(int)num1;
        num1 = num1 * 100;
        num1 = (int)num1;
        System.out.println(num1);




        // Milestone 3
        for (int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for (int j = 2; j <= (i/2); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }






        // Milestone 4
        Scanner okay = new Scanner(System.in);
        System.out.println("Enter a number for seconds");
        int userTime = okay.nextInt();
        int numberOfDays;
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfDays = userTime / 86400;
        numberOfHours = (userTime % 86400 ) / 3600;
        numberOfMinutes = ((userTime % 86400 ) % 3600 ) / 60;
        numberOfSeconds = ((userTime % 86400 ) % 3600 ) % 60;

        System.out.println("Number of days: " + numberOfDays);
        System.out.println("Number of hours: " + numberOfHours);
        System.out.println("Number of minutes: " + (numberOfMinutes);
        System.out.println("Number of seconds: " + numberOfSeconds);

    }
}
