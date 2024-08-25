import java.util.Scanner;

public class excercise_Java {
    public static void main(String[] args) {
        System.out.println("Conversion Of Marks Into Percentage");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Subject Marks: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Subject Marks: ");
        double b = sc.nextDouble();

        System.out.print("Enter Third Subject Marks: ");
        double c = sc.nextDouble();

        System.out.print("Enter Fourth Subject Marks: ");
        double d = sc.nextDouble();

        System.out.print("Enter total Subject Marks: ");
        int t = sc.nextInt();

        double res = ((a + b + c + d )/t)*100;

        System.out.print("Percentage of above marks are: " +res);


    }
}
