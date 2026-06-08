import java.util.Scanner;

public class age {

    static void vote(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        try {
            vote(age);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}