import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        String age = input.next();
        int convAge = Integer.parseInt(age);

        if (convAge >= 16)
        {
            System.out.println("You are old enough to legally drive.");
        }
        else
        {
            System.out.println("You are not old enough to legally drive.");
        }

    }
}
