import java.util.Scanner;

// class Addition {
//     float add(int num1, int num2) {
//         return num1 + num2;
//     }
// }

public class lab_Practice_problem1 {
    static double c;
    static double d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.nextLine();

        // System.out.println("your name is: " + name);
        // System.out.println("Addition of two number");

        // System.out.print("Enter your first number: ");
        // int a = sc.nextInt();

        // System.out.println("Enter second number: ");
        // int b = sc.nextInt();

        // System.out.println("Addition of number is : " + (a + b));
        // System.out.println("Enter the first number for Static multiplication");
        // c = sc.nextDouble();

        // System.out.println("Enter the second number for static multiplication ");
        // d = sc.nextDouble();

        // System.out.println("Multiplication: " + (a * b));
        // System.out.println("Enter the first number for addition");
        // int num1 = sc.nextInt();

        // System.out.println("Enter the second number");
        // int num2 = sc.nextInt();

        // Addition obj = new Addition();
        // double result = obj.add(num1, num2);
        // System.out.println("Addition with out Static method :" + result);

System.out.println("enter the mass of the object");
double mass = sc.nextDouble();
System.err.println("enter the velocity of the object");
double velo = sc.nextDouble();
double KE = 0.5*(mass*velo*velo);
System.out.println("kinetic energy of an obj is : "+KE);
        sc.close();
    }
}
