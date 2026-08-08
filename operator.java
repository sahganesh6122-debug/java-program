public class operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Arithmatic operatiors
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("multiplication: " + (a * b));
        System.out.println("division: " + (a / 20.0));
        System.out.println("Modulous: " + (a % b));
        // Logical operatiors
        System.out.println("AND: " + (a > b && b < a));
        System.out.println("OR: " + (a > b || a < b));
        System.out.println("NOT: " + !(a > b));
        // relational operator
        System.out.println("greater than: " + (a > b));
        System.out.println("greater then equal to: " + (a >= b));
        System.out.println("less than: " + (a < b));
        System.out.println("less than equal to: " + (a <= b));
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not Equal to: " + (a != b));
        if(a>b)
        {
            System.out.println("yoyo honey singer");
        }
        else{
            System.out.println("bhak saar");
        }

    }
}